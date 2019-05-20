package com.softengg;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
	private int restaurant_no;
	private String restaurant_name;
	private String address;
	private String contact_no;
	private ArrayList<Menu> menuitems;
	
	
	public Restaurant() {
		menuitems = new ArrayList<Menu>();
	}


	public Restaurant(int restaurant_no, String restaurant_name, String address, String contact_no,
			ArrayList<Menu> menuitems) {
		super();
		this.restaurant_no = restaurant_no;
		this.restaurant_name = restaurant_name;
		this.address = address;
		this.contact_no = contact_no;
		this.menuitems = menuitems;
	}

	public Restaurant(int restaurant_no, String restaurant_name, String address, String contact_no) {
		super();
		this.restaurant_no = restaurant_no;
		this.restaurant_name = restaurant_name;
		this.address = address;
		this.contact_no = contact_no;
	}

	public int getRestaurant_no() {
		return restaurant_no;
	}


	public void setRestaurant_no(int restaurant_no) {
		this.restaurant_no = restaurant_no;
	}


	public String getRestaurant_name() {
		return restaurant_name;
	}


	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact_no() {
		return contact_no;
	}


	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}


	public ArrayList<Menu> getMenuitems() {
		return menuitems;
	}


	public void setMenuitems(ArrayList<Menu> menuitems) {
		this.menuitems = menuitems;
	}
	
	public void addItem(Menu menu)
	{
		menuitems.add(menu);
		setMenuitems(menuitems);
	}
	
	public static String acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		return input;
	}
	ArrayList<Menu> orderItems = new ArrayList<Menu>();
	
	
	
	
	
	
	public Restaurant displayRestaurant(Restaurant r1) {
		
		//clrscr();
		System.out.println("DERBY THAI\n" + "Authentic Thai Cusine\n"+"Takeaway available");
		System.out.println(r1.getRestaurant_name());
		System.out.println("Do you wish to see the menu? Press 1 \n" + "Do you wish to go back? Press 2 \n");
		int choice = Integer.parseInt(acceptInput());
		//if (choice == 1)
		//{
			int index = choice - 1;
			//System.out.println(index);
			
			//System.out.println(getMenuitems().get(index));
			
			//return r1;
			Restaurant restaurant = addMenu(r1, index);
			return restaurant;
		//}
		//return null;
		
	}


	public Restaurant addMenu(Restaurant r1, int index) {
		
		
		if(r1.getRestaurant_name()=="Derby Thai")
		{
		menuitems = new ArrayList<Menu>();
		menuitems.add(new Menu(101, "Soup", 10, "Tomato soup with Basil leaves"));
		menuitems.add(new Menu(102, "Honey glazed chicken", 20, "Chickenn drumsticks"));
		r1 = new Restaurant(1,"Restaurant 1","Carnegie","9969777510",menuitems);
		}
		else
			if(r1.getRestaurant_name()=="Korean Kimchi")
			{
		menuitems = new ArrayList<Menu>();
		menuitems.add(new Menu(201, "Soup", 10, "Tomato soup with Basil leaves"));
		menuitems.add(new Menu(202, "Honey glazed chicken", 20, "Chickenn drumsticks"));
		r1 = new Restaurant(2,"Restaurant 2","Glen Huntly","111111",menuitems);
			}
			else
				System.out.println("Invalid");
		return r1;
		//System.out.println("1. " + menuitems.get(index).getItem_name() + "\n" + menuitems.get(index).getItem_desc());
	}
	
	/*public void addCart(Restaurant r1)
	{
		for (int i = 0; i < r1.getMenuitems().size(); i++)
		{
			System.out.println(r1.getMenuitems().get(i).getMenu_no() + " " + r1.getMenuitems().get(i).getItem_name()
					+ " " + r1.getMenuitems().get(i).getItem_desc()+ " " + r1.getMenuitems().get(i).getItem_price()+ "$");
		}
		
		int choice = 0;
		
		while(choice!=7)
		{
			System.out.println("Please choose menu-items to add to cart\n" + "Press 7 to exit selection");
			choice = Integer.parseInt(acceptInput());
			
		
			for (int i = 0; i < r1.getMenuitems().size(); i++)
			{
				if (choice == r1.getMenuitems().get(i).getMenu_no())
				{
					String item_name = r1.getMenuitems().get(i).getItem_name();
					double price = r1.getMenuitems().get(i).getItem_price();
					orderItems.add(new Menu(item_name,price));
					System.out.println("Item added to the cart \n");
					//System.out.println(orderItems.get(0).getItem_name());
					break;
				}
			}
		
			
		}
		Cart cart = new Cart(orderItems);	
		cart.displayCart(r1);
		
		System.out.println("1. checkout \n" + "2. Add items\n" + "3. Remove items\n" + "4. Exit");
		Scanner sc = new Scanner(System.in);
		int choice1 = Integer.parseInt(sc.next());
		switch(choice1)
		{
		case 1: 
			cart.checkout(orderItems);
			break;
		case 2:
			addCart(r1);
			break;
		case 3:
			removeCart(orderItems,r1);
			break;
		}
	}
		//System.out.println("Out of the loop");
*/

	public void removeCart(ArrayList<Menu> orderItems, Restaurant r1) {
		
		for (Menu item : orderItems)
		{
		
			System.out.println(item.getItem_name());
		}
		System.out.println("Enter item name to remove");
		String user_choice = acceptInput();
		for( int i =0; i<orderItems.size();i++)
		{
			if (user_choice.equals(orderItems.get(i).getItem_name()))
			{
				//System.out.println("Inside if");
				
				//System.out.println("Index is: "+index);
				orderItems.remove(i);
				System.out.println("Item removed!");
				Cart cart = new Cart(orderItems);
				cart.displayCart(r1);
				break;
			}
			
				
		}
		
		

	}
}
	

	


