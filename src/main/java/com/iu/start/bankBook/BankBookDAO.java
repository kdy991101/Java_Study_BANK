package com.iu.start.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.stereotype.Repository;

import com.iu.start.util.DBConnector;

import oracle.jdbc.proxy.annotation.Pre;

@Repository
public class BankBookDAO implements BookDAO {

	public int setBankbook(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		//bankbook table에 insert
		//booknum=현재시간을 밀리세컨즈로 변환해서 입력
		//booksale=1로 입력
		Connection con = DBConnector.getConnection();
		
		String sql = "INSERT INTO BANKBOOK VALUES (?,?,?,1)";
		
		PreparedStatement st = con.prepareStatement(sql);
		Calendar ca = Calendar.getInstance();	
		
		
		st.setLong(1, ca.getTimeInMillis());
		st.setString(2, bankBookDTO.getBookName());
		st.setDouble(3, bankBookDTO.getBookRate());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}

	public ArrayList<BankBookDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		//bankbook에 있는 모든 데이터를 조회 최신순으로
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM BANKBOOK ORDER BY BOOKNUM DESC";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNum(rs.getLong("BookNum"));
			bankBookDTO.setBookName(rs.getString("BookName"));
			bankBookDTO.setBookRate(rs.getDouble("BookRate"));
			bankBookDTO.setBookSale(rs.getInt("BookSale"));
			ar.add(bankBookDTO);
		}
		DBConnector.disConnect(st, con);
		return ar;
	}

	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		//sale컬럼 수정
		Connection con = DBConnector.getConnection();
//		UPDATE MEMBER SET KIND=1 WHERE ID = 'r8895r';
		 String sql = "UPDATE BANKBOOK SET BOOKSALE=? WHERE BOOKNUM=?";
		 PreparedStatement st = con.prepareStatement(sql);
		 
		 st.setLong(1, bankBookDTO.getBookNum());
		 st.setInt(2, bankBookDTO.getBookSale());
		 
		 int result = st.executeUpdate();
		 
		 return result;
	}


	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		
		BankBookDTO bankBookDTO2 = null;
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUM=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, bankBookDTO.getBookNum());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			bankBookDTO2 = new BankBookDTO();
			bankBookDTO2.setBookNum(rs.getLong("bookNum"));
			bankBookDTO2.setBookName(rs.getString("bookName"));
			bankBookDTO2.setBookRate(rs.getDouble("bookrate"));
			bankBookDTO2.setBookSale(rs.getInt("booksale"));
		
		}
		
		DBConnector.disConnect(st, con);
		return bankBookDTO2;
	}

	@Override
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = DBConnector.getConnection();
		
		String sql = "UPDATE BANKBOOK SET BOOKNAME=?,BOOKRATE=? WHERE BOOKNUM=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankBookDTO.getBookName());
		st.setDouble(2, bankBookDTO.getBookRate());
		st.setLong(3, bankBookDTO.getBookNum());
		 
		 int result = st.executeUpdate();
		 
		 DBConnector.disConnect(st, con);
		 
		 return result;
	}

	@Override
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		Connection con = DBConnector.getConnection();
		
		String sql = "DELETE BANKBOOK WHERE BOOKNUM=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, bankBookDTO.getBookNum());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
		
	}
	
	
	
	

	

}
