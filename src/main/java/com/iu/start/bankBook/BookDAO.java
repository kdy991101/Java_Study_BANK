package com.iu.start.bankBook;

import java.util.ArrayList;

public interface BookDAO {
	//bankbook table에 insert
	//booknum=현재시간을 밀리세컨즈로 변환해서 입력
	//booksale=1로 입력
	
	public int setBankbook(BankBookDTO bankBookDTO) throws Exception;
	
	
	//bankbook에 있는 모든 데이터를 조회 최신순으로
	public ArrayList<BankBookDTO> getList() throws Exception;
	
	//sale컬럼 수정
	public int setChangeSale(BankBookDTO bankBookDTO)throws Exception;
	
	//booknum의 값으로 조회
	public BankBookDTO getDetail(BankBookDTO bankBookDTO)throws Exception;
	
	public int setUpdate(BankBookDTO bankBookDTO)throws Exception;
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception;


}
