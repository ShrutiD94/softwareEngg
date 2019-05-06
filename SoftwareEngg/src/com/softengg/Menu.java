package com.softengg;

public class Menu {
	
	private int menu_no;
	private String item_name;
	private double item_price;
	private String item_desc;
	
	
	public Menu() {
		super();
	}


	public Menu(int menu_no, String item_name, double item_price, String item_desc) {
		
		this.menu_no = menu_no;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_desc = item_desc;
	}
	

	public Menu(String item_name, double item_price) {
		this.item_name = item_name;
		this.item_price = item_price;
	}


	public int getMenu_no() {
		return menu_no;
	}


	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public double getItem_price() {
		return item_price;
	}


	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}


	public String getItem_desc() {
		return item_desc;
	}


	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	
	
	

}
