package com.iu.start.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.start.util.DBConnector;

public class BoardDAO {
	
	public ArrayList<BoardDTO> getlist()throws Exception{
		ArrayList<BoardDTO> ar = new ArrayList<BoardDTO>();
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT NUM,TITLE,NAME,DAY,VIEWS FROM BOARD";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
	
		while(rs.next()) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setNum(rs.getLong("NUM"));
			boardDTO.setTitle(rs.getString("TITLE"));
			boardDTO.setName(rs.getString("NAME"));
			boardDTO.setDate(rs.getDate("DAY"));	
			boardDTO.setViews(rs.getLong("VIEWS"));	
			ar.add(boardDTO);
		}
		DBConnector.disConnect(st, con);
		return ar;
	}
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception{
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM BOARD";
		
		PreparedStatement st = con.prepareStatement(sql);
		
//		st.setLong(1, boardDTO.getNum());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			boardDTO = new BoardDTO();
			boardDTO.setNum(rs.getLong("num"));
			boardDTO.setTitle(rs.getString("title"));
			boardDTO.setContents(rs.getString("contents"));
			boardDTO.setName(rs.getString("name"));
			boardDTO.setDate(rs.getDate("DAY"));
			boardDTO.setViews(rs.getLong("views"));
		}
		DBConnector.disConnect(st, con);
		return boardDTO;
	}
	
	public int setAdd(BoardDTO boardDTO) throws Exception{
		Connection con = DBConnector.getConnection();
		
		String sql = "INSERT INTO BOARD VALUES(BOARD_SEQ.NEXTVAL,?,?,?,SYSDATE,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, boardDTO.getTitle());
		st.setString(2, boardDTO.getContents());
		st.setString(3, boardDTO.getName());
		st.setLong(4, boardDTO.getViews());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}
	
	public int setUpdate(BoardDTO boardDTO) throws Exception{
		
		Connection con = DBConnector.getConnection();
		
		String sql = "UPDATE BOARD SET TITLE=?,CONTENTS=?,NAME=?,SYSDATE,VIEWS=? WHERE NUM=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, boardDTO.getTitle());
		st.setString(2, boardDTO.getContents());
		st.setString(3, boardDTO.getName());
		st.setLong(4, boardDTO.getViews());
		st.setLong(5, boardDTO.getNum());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
		
	}
	
	public int setDelete(BoardDTO boardDTO) throws Exception{
		Connection con = DBConnector.getConnection();
		
		String sql = "DELETE BOARD WHERE NUM=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, boardDTO.getNum());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
		
	}


}
