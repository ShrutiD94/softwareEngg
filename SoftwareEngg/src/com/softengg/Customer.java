package com.softengg;

import java.util.ArrayList;

public class Customer {

	private String customer_fname;
	private String customer_lname;
	private String email_address;
	private String phone_no;
	private String address;
	private boolean isRange;
	private Cart cart;
	private User user;
	private ArrayList<Order> ordered_items;
	
	public Customer()
	{
		cart = new Cart();
		ordered_items = new ArrayList<Order>();
	}

	public Customer(String customer_fname, String customer_lname, String email_address, String phone_no, String address,
			boolean isRange) {
		
		this.customer_fname = customer_fname;
		this.customer_lname = customer_lname;
		this.email_address = email_address;
		this.phone_no = phone_no;
		this.address = address;
		this.isRange = isRange;
		cart = new Cart();
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public String getCustomer_fname() {
		return customer_fname;
	}

	public void setCustomer_fname(String customer_fname) {
		this.customer_fname = customer_fname;
	}

	public String getCustomer_lname() {
		return customer_lname;
	}

	public void setCustomer_lname(String customer_lname) {
		this.customer_lname = customer_lname;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isRange() {
		return isRange;
	}

	public void setRange(boolean isRange) {
		this.isRange = isRange;
	}

	@Override
	public String toString() {
		return "Customer [customer_fname=" + customer_fname + ", customer_lname=" + customer_lname + ", email_address="
				+ email_address + ", phone_no=" + phone_no + ", address=" + address + ", isRange=" + isRange + "]";
	}
	
	public void addCart(Menu menuItems)
	{
		//Cart cart = new Cart();
		cart.addItems(menuItems);
		
	}
	
	public void checkout(Restaurant r1)
	{
		System.out.println("in checkout");
		ordered_items.add(new Order("21st July","ABC",cart));
		
		
	}
	
	
	
	
	
}
