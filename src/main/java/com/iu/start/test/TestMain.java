//package com.iu.start.test;
//
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Scanner;
//
//import com.iu.start.bankBook.BankBookDAO;
//import com.iu.start.bankBook.BankBookDTO;
//import com.iu.start.bankMembers.BankMembersDAO;
//import com.iu.start.bankMembers.BankMembersDTO;
//
//public class TestMain {
//
//	public static void main(String[] args) {
////
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
//		BankBookDTO bankBookDTO = new BankBookDTO();
//		BankBookDAO bankBookDAO = new BankBookDAO();
//		
		//=====================================members=============1
//		bankMembersDTO.setUsername("rsef");
//		bankMembersDTO.setPassword("aqt");
//		bankMembersDTO.setName("dwcz");
//		bankMembersDTO.setEmail("xvg");
//		bankMembersDTO.setPhone("010-654");
//		try {
//			int result  = bankMembersDAO.setJoin(bankMembersDTO);
////			int result = bankMembersDao.setJoin(testData);
//			if(result == 1) {
//				System.out.println("성공");
//			} else {
//				System.out.println("실패");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
		//===========================members===============================2
//				try {
//					ArrayList<BankMembersDTO> ar = bankMembersDAO.getSearchBy("6");
//					System.out.println(ar.size()>0);			
//			int result = bankMembersDAO.setJoin(bankMembersDTO);
//			System.out.println(result);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		=================bankbook=================================1
//		Calendar ca = Calendar.getInstance();
//		bankBookDTO.setBookNum(ca.getTimeInMillis());
//		bankBookDTO.setBookName("dfs");
//		bankBookDTO.setBookRate(3.42);
//		bankBookDTO.setBookSale(1);
//		int result;
//		try {
//			result = bankBookDAO.setBankbook(bankBookDTO);
//			System.out.println(result);//1
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//====================bankbook===========================================2
//		try {		
//			ArrayList<BankBookDTO> ar = bankBookDAO.getList();
//			int q=0;
//			if(q > ar.size()) {
//				for(int i = 0; i>ar.size(); i++) {
//					System.out.println(ar.get(i).getBookNum());
//					System.out.println(ar.get(i).getBookName());
//					System.out.println(ar.get(i).getBookRate());
//					System.out.println(ar.get(i).getBookSale());
//				}
//				q++;
			//}
//			for(int i = 0; i>ar.size(); i++) {
//				System.out.println(ar.get(i).getBookNum());
//				System.out.println(ar.get(i).getBookName());
//				System.out.println(ar.get(i).getBookRate());
//				System.out.println(ar.get(i).getBookSale());
//				
//			}
//				System.out.println("오류입니다");
			
//			for(BankBookDTO bankBookDTO1 : ar) {
//				System.out.println(bankBookDTO.getBookNum());
//				System.out.println(bankBookDTO.getBookName());
//				System.out.println(bankBookDTO.getBookRate());
//				System.out.println(bankBookDTO.getBookSale());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		==========================================================================3
//		bankBookDTO.setBookNum(2L);
//		bankBookDTO.setBookSale(5);
//		 try {
//			int result = bankBookDAO.setChangeSale(bankBookDTO);
//			
//			if(result == 1) {
//				System.out.println("성공");
//			} else {
//				System.out.println("실패");
//			}
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//		===========================================bankbook==============4
//		try {
//			bankBookDAO.getDetail(bankBookDTO);
//		} catch (Exception e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//			bankBookDTO.setBookNum(111L);
//			try {
//				bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			System.out.println(bankBookDTO != null);
//	}
		//==================================bankbook=====================5
//		int result;
//		try {
//			result = bankBookDAO.setUpdate(bankBookDTO);
//			if(result==1) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//}
//}


