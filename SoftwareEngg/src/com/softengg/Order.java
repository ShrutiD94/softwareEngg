package com.softengg;

import java.util.ArrayList;

public class Order {
	//private ArrayList<Menu> orderItems;
	private int orderID;
	private String date;
	private String customer_name;
	private double amount;
	private Cart cart;
	
	
	public Order() {
		super();
	}

	

	public Order(String date, String customer_name, Cart cart) {
		super();
		this.date = date;
		this.customer_name = customer_name;
		//this.amount = amount;
		this.cart = cart;
	}



	public Order(int orderID, String date, String customer_name, double amount, Cart cart) {
		super();
		//this.orderID = orderID;
		this.date = date;
		this.customer_name = customer_name;
		//this.amount = amount;
		this.cart = cart;
	}



	/*public Order(ArrayList<Menu> orderItems, int orderID, String date, String customer_name, double amount) {
		super();
		this.orderItems = orderItems;
		this.orderID = orderID;
		this.date = date;
		this.customer_name = customer_name;
		this.amount = amount;
	}*/



	/*public ArrayList<Menu> getOrderItems() {
		return orderItems;
	}



	public void setOrderItems(ArrayList<Menu> orderItems) {
		this.orderItems = orderItems;
	}*/



	public int getOrderID() {
		return orderID;
	}



	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getCustomer_name() {
		return customer_name;
	}



	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public Cart getCart() {
		return cart;
	}



	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public void showOrder(ArrayList<Menu> items)
	{
		System.out.println("in here");
		for (int index = 0; index < items.size(); index++)
		System.out.println(items.get(index).getItem_name());
	}

	public void confirmOrder(ArrayList<Menu> orderItems)
	{
		for(Menu item : orderItems)
		{
			System.out.println("Order placed Successfully!");
			System.out.println(item.getItem_name() + "  " + item.getItem_price()+" AUD");
			amount = amount + item.getItem_price();
			Customer customer = new Customer();
			System.out.println("Order placed by: "+ customer.getCustomer_fname() + " " + customer.getCustomer_lname());
			
		}
	}
	
	

}
