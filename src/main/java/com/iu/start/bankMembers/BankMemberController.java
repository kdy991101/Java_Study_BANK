package com.iu.start.bankMembers;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.GapContent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.start.bankBook.BankBookDTO;

//annotation
//@들어가있는 것:성명+실행
@Controller//이 클래스는 controller역할입니다라는 설명과 컨테이너(생명주기를 관리)에게
			//이 클래스의 객체를 생성을 위임
@RequestMapping(value = "/member/*")//루트밑에 member로 시작하는 것들은 모두 여기로 와라~
public class BankMemberController {
	
	@Autowired
	private BankMembersService bankMembersService;
	
//	@Autowired
//	public BankMemberController(BankMembersDAO bankMembersDAO) {
//		this.bankMembersDAO = bankMembersDAO;
//	}
	
	// /member/login
	@RequestMapping(value = "login.do", method = RequestMethod.GET)//(요청에 대한mapping)
//	(value = "/member/login")
	public String login() {
		System.out.println("Login 실행");
		return "member/login";
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request, BankMembersDTO bankMembersDTO, Model model) throws Exception {
		System.out.println("로그인 실행");
		bankMembersDTO = bankMembersService.getLogin(bankMembersDTO);
		System.out.println(bankMembersDTO);
		model.addAttribute("member", bankMembersService);
		HttpSession session = request.getSession();
		session.setAttribute("member", bankMembersDTO);
		return "redirect:../";
	}
	
//메서드명 join 죽소는 멤버의 조인이라는 주소가 들어오면 실행 선언 
	//get
	@RequestMapping(value = "join.do", method = RequestMethod.GET)//get방식만 받겠다~
	public String join() {
		System.out.println("get Join실행");
		return "member/join";
	}
	
	//post
	@RequestMapping(value = "/member/join.do", method = RequestMethod.POST)//post방식만 받겠다~
	public String join(BankMembersDTO bankMembersDTO) throws Exception {
		System.out.println("post Join실행");
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();

//		bankMembersDTO.setUsername(request.getParameter("id"));
//		bankMembersDTO.setPassword(request.getParameter("pw"));
//		bankMembersDTO.setName(request.getParameter("name"));
//		bankMembersDTO.setPhone(request.getParameter("phone"));
//		bankMembersDTO.setEmail(request.getParameter("emil"));
		
//String id = request.getparameter("id")
//bankmemberDTO.setUsername(username)
//하나로 bankMembersDTO.setUsername(request.getParameter("id"));

			int result  = bankMembersService.setJoin(bankMembersDTO);
			if(result == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		return "member/login";
	}
	
	@RequestMapping(value = "search.do", method = RequestMethod.GET)
	public String getSearchByID() throws Exception{
		System.out.println("get search실행");
		return "member/search";
		
	}
	@RequestMapping(value = "search.do", method = RequestMethod.POST)
	public String getSearchByID(String search, Model mv) throws Exception{
		System.out.println("post search실행");
		List<BankMembersDTO> ar = bankMembersService.getSearchByID(search);
		mv.addAttribute("search", ar);
		return "member/list";
		
	}
	
	@RequestMapping(value = "logout.do", method = RequestMethod.GET)
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:../";
	}

}