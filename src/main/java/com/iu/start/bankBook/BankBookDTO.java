package com.iu.start.bankBook;

public class BankBookDTO {
	private Long bookNum;
	private String bookName;
	private Double bookRate;
	private Integer bookSale;
	
	public Long getBookNum() {
		return bookNum;
	}
	public void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookRate() {
		return bookRate;
	}
	public void setBookRate(Double bookRate) {
		this.bookRate = bookRate;
	}
	public Integer getBookSale() {
		return bookSale;
	}
	public void setBookSale(Integer bookSale) {
		this.bookSale = bookSale;
	}
	
	
}

//=======
//Calendar ca = Calendar.getInstance();
////bankBookDTO.setBookNum(ca.getTimeInMillis());
////bankBookDTO.setBookName("dfs");
////bankBookDTO.setBookRate(3.42);
////bankBookDTO.setBookSale(1);
////int result;
////try {
////	result = bankBookDAO.setBankbook(bankBookDTO);
////	System.out.println(result);//1
////} catch (Exception e) {
////	// TODO Auto-generated catch block
////	e.printStackTrace();
////}
