package com.softengg;

import java.util.ArrayList;
import java.util.Scanner;

public class MonashEats {
	
	private static ArrayList<Customer> customers;
	private ArrayList<Restaurant> restaurants;
	static Customer customer;
	

	public MonashEats() {
		//customers = new ArrayList<Customer>();
		restaurants = new ArrayList<Restaurant>();
		customer = new Customer();
	}

	public MonashEats(ArrayList<Customer> customers, ArrayList<Restaurant> restaurants) {
		super();
		this.customers = customers;
		this.restaurants = restaurants;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(ArrayList<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	public static String acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		return input;
	}
	
	public static void selectOption(String option)
	{
		switch(option)
		{
		case "1": 
			System.out.println("OPEN RESTAURANTS: \n" + "1. DERBY THAI \n" + "KOREAN KIMCHI \n" + "Please choose a restaurant" );
			int choice = Integer.parseInt(acceptInput());
			MonashEats monash = new MonashEats();
			Restaurant r1 = new Restaurant(1,"Derby Thai","Carnegie","9969777510");
			monash.restaurants.add(r1);
			Restaurant r2 = new Restaurant(2,"Korean Kimchi","Glen Huntly","111111");
			monash.restaurants.add(r1);
			Restaurant restaurant = monash.restaurants.get(choice).displayRestaurant(r1);
			displayMenu(restaurant);
			addToCart(restaurant);
			checkout(restaurant);
			
						
			
			break;
		case "2": 
			System.out.println("No Items to checkout! Please place an order first");
			System.out.println("Choose your options:\n" + "1. Place Order\n" + "2. Checkout");
			String option1 = acceptInput();
			selectOption(option1);
			break;
			
		}

	}
	
	public static Restaurant displayMenu(Restaurant r1)
	{
		for (int i = 0; i < r1.getMenuitems().size(); i++)
		{
			System.out.println(r1.getMenuitems().get(i).getMenu_no() + " " + r1.getMenuitems().get(i).getItem_name()
					+ " " + r1.getMenuitems().get(i).getItem_desc()+ " " + r1.getMenuitems().get(i).getItem_price()+ "$");
		}
		return r1;
	}
	public static Restaurant addToCart(Restaurant r1)
	{
		/*for (int i = 0; i < r1.getMenuitems().size(); i++)
		{
			System.out.println(r1.getMenuitems().get(i).getMenu_no() + " " + r1.getMenuitems().get(i).getItem_name()
					+ " " + r1.getMenuitems().get(i).getItem_desc()+ " " + r1.getMenuitems().get(i).getItem_price()+ "$");
		}*/
		//ArrayList<Menu> orderItems = new ArrayList<Menu>();
		int choice = 0;
		//Customer customer = new Customer();
		while(choice!=7)
		{
			System.out.println("Please choose menu-items to add to cart\n" + "Press 7 to exit selection");
			choice = Integer.parseInt(acceptInput());
			
		
			for (int i = 0; i < r1.getMenuitems().size(); i++)
			{
				if (choice == r1.getMenuitems().get(i).getMenu_no())
				{
					
					
					//String item_name = r1.getMenuitems().get(i).getItem_name();
					//double price = r1.getMenuitems().get(i).getItem_price();
					//orderItems.add(new Menu(item_name,price));
					
					customer.addCart(r1.getMenuitems().get(i));
					System.out.println("Item added to the cart \n");
					//System.out.println(orderItems.get(0).getItem_name());
					//checkout(r1);
					break;
				}
			}
		
			
		}
		//System.out.println("1. Checkout\n" + "2. Add Items");
		//Cart cart = new Cart(orderItems);
		
		return r1;
	}
	
	public static void checkout(Restaurant r1)
	{
		System.out.println("1. Confirm order\n" + "2. add items\n");
		int user_choice = Integer.parseInt(acceptInput());
		if (user_choice == 1)
		{
			customer.checkout(r1);
			//customer.getCart().getOrderitems();
			Order order = new Order();
			order.showOrder(customer.getCart().getOrderitems());
		}
		else
			
		{
			addToCart(r1);
			checkout(r1);
		}
	}
	

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Shruti","Dhawale","shruti@gmail.com","999999","glen huntly",true));
		System.out.println("**********WELCOME TO MONASH EATS**********");
		System.out.println("Choose your options:\n" + "1. Place Order\n" + "2. Checkout");
		String option = acceptInput();
		selectOption(option);
				
		
		
		
				
		

	}

}
