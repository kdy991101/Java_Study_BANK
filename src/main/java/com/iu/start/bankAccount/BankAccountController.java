package com.iu.start.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.start.bankMembers.BankMembersDTO;
@Controller
@RequestMapping("/bankAccount/*")
public class BankAccountController {
	
	private BankAccountDAO bankAccountDAO;
	
	public BankAccountController() {
		this.bankAccountDAO = new BankAccountDAO();
	
	}
	
	@RequestMapping(value = "add.do", method = RequestMethod.GET)
	public String add(BankAccountDTO bankAccountDTO, HttpSession session) throws Exception {
		System.out.println("bankaccount add");
		System.out.println(bankAccountDTO.getBookNum());
		
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("member");
		bankAccountDTO.setUserName(bankMembersDTO.getUsername());
		int result = this.bankAccountDAO.add(bankAccountDTO);
		
		return "redirect:../bankbook/list.do";
		
	}

}
