package com.iu.start.board;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.start.bankBook.BankBookDAO;
import com.iu.start.bankBook.BankBookDTO;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {
		
	@RequestMapping(value = "list.do", method = RequestMethod.GET)
	public String list(Model model)throws Exception{
		System.out.println("board list실행");
		BoardDAO boardDAO = new BoardDAO();
		ArrayList<BoardDTO> ar = boardDAO.getlist();
		model.addAttribute("list",ar);
		return "board/list";
			
	}
	
	@RequestMapping(value = "detail.do", method = RequestMethod.GET)
	public ModelAndView detail(BoardDTO boardDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("board detail실행");
		
		BoardDAO boardDAO = new BoardDAO();
		boardDTO = boardDAO.getDetail(boardDTO);
		mv.setViewName("board/detail");
		mv.addObject("detail", boardDTO);
		return mv;
	}
	
	@RequestMapping(value = "add.do", method = RequestMethod.GET)
	public String add()throws Exception{
		System.out.println("add실행");
		return "board/add";
	}
	
	@RequestMapping(value = "add.do", method = RequestMethod.POST)
	public ModelAndView add(BoardDTO boardDTO) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		BoardDAO boardDAO = new BoardDAO();
		
		int result = boardDAO.setAdd(boardDTO);
		
		if(result == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		mv.setViewName("redirect:./list.do");
		return mv;
	}
	
	@RequestMapping(value = "update.do", method = RequestMethod.GET)
	public String update() {
		System.out.println("업데이트 실행");
//		BoardDAO boardDAO = new BoardDAO();
//		boardDAO =boardDAO.setUpdate(boardDTO);
		return "board/update";	
	}
	
	@RequestMapping(value = "update.do", method = RequestMethod.POST)
	public ModelAndView update(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		BoardDAO boardDAO = new BoardDAO();
		int result = boardDAO.setUpdate(boardDTO);
		
		if(result == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		
		mv.setViewName("redirect:./list.do");
		return mv;	
		}
	
	@RequestMapping(value = "delete.do", method = RequestMethod.GET)
	public ModelAndView delete(BoardDTO boardDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		BoardDAO boardDAO = new BoardDAO();
		int result = boardDAO.setDelete(boardDTO);
		
		if(result == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		mv.setViewName("redirect:./list.do");
		return mv;
	}

}
