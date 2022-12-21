package com.entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable= false)
	private String customerName;
	
	@Column(name="phone",nullable= false)
	private long phoneNumber;
	
	@Column(name="student_email",nullable= false)
	private String emailAddress;
	
	@OneToOne( fetch = FetchType.LAZY)
	
	@JoinColumn(name= "delete_please" )
	private Event fees;

	public Object getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCustomerName(Object customerName2) {
		// TODO Auto-generated method stub
		
	}

	public void setPhone(Object phone) {
		// TODO Auto-generated method stub
		
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEmail(Object email) {
		// TODO Auto-generated method stub
		
	}


}
