package com.softengg;

public class Customer {

	private String customer_fname;
	private String customer_lname;
	private String email_address;
	private String phone_no;
	private String address;
	private boolean isRange;
	
	public Customer()
	{
		
	}

	public Customer(String customer_fname, String customer_lname, String email_address, String phone_no, String address,
			boolean isRange) {
		
		this.customer_fname = customer_fname;
		this.customer_lname = customer_lname;
		this.email_address = email_address;
		this.phone_no = phone_no;
		this.address = address;
		this.isRange = isRange;
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
	
	
	
	
	
}
