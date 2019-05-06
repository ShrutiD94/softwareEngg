package com.softengg;

import java.util.ArrayList;
import java.util.Scanner;

public class MonashEats {
	
	private ArrayList<Customer> customers;
	private ArrayList<Restaurant> restaurants;
	
	

	public MonashEats() {
		customers = new ArrayList<Customer>();
		restaurants = new ArrayList<Restaurant>();
	
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

	public static void main(String[] args) {
		
		System.out.println("**********WELCOME TO MONASH EATS**********");
		System.out.println("OPEN RESTAURANTS: \n" + "1. Restaurant 1 \n" + "2. Restaurant 2 \n" + "Please choose a restaurant" );
		String choice = acceptInput();
		MonashEats monash = new MonashEats();
		Restaurant r1 = new Restaurant(1,"Restaurant 1","Carnegie","9969777510");
		monash.restaurants.add(r1);
		Restaurant r2 = new Restaurant(2,"Restaurant 2","Glen Huntly","111111");
		monash.restaurants.add(r1);
		
		
		switch(choice) {
		
		case "1":
			monash.restaurants.get(0).displayRestaurant(r1);
			break;
			
		case "2":
			monash.restaurants.get(1).displayRestaurant(r2);
			break;
			
		}

	}

}
