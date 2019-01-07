package entities;

import java.sql.Date;

public class Order {
	
	private Date date;
	private Product prodruct;
	
	
	public Order(Date date, Product prodruct) {
		super();
		this.date = date;
		this.prodruct = prodruct; 
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Product getProdruct() {
		return prodruct;
	}


	public void setProdruct(Product prodruct) {
		this.prodruct = prodruct;
	}
	
	
	
	

}
