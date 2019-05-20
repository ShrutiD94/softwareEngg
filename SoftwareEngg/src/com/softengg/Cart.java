package com.softengg;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
	
	private ArrayList<Menu> orderitems;
	//private String item_name;
	//private double item_price;
	
	
	public Cart() {
		super();
		orderitems =new ArrayList<Menu>();
	}
	public Cart(ArrayList<Menu> orderitems) {
		super();
		this.orderitems = orderitems;
	}
	public ArrayList<Menu> getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(ArrayList<Menu> orderitems) {
		this.orderitems = orderitems;
	}
	
	public void displayCart(Restaurant r1)
	{
		System.out.println("**********CART****************");
		for (Menu item : orderitems)
		{
			System.out.println(item.getItem_name());
		}
		
	}
	
	public void addItems(Menu item)
	{
		orderitems.add(item);
		
		for (int i =0; i<orderitems.size(); i++)
		{
			System.out.println(orderitems.get(i).getItem_name());
		}
		
	}
	public void checkout(ArrayList<Menu> orderItems) {
		
		double total_price = 0;
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		for(Menu item : orderItems)
		{
			System.out.println(item.getItem_name() + "  " + item.getItem_price()+" AUD");
			total_price = total_price + item.getItem_price();
			
		}
		System.out.println("Total Price: " + total_price);	
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		System.out.println("Please select Payment Mode:\n\n1.Cash \n"+ "2.Coupons\n"+"3.Cash + Coupons \n");
		System.out.println("Checking out");
		System.out.println("Order confirmed!");
		Order placed_order = new Order();
		placed_order.confirmOrder(orderItems);
		
	}


	
	

}
