package jdbc01;

import java.io.Serializable;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer bid;
	private String bname;
	private String author;
	private double price;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(Integer bid, String bname, String author, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
	}
	
	
}
