package com.entity;


import javax.persistence.Column;


public class Event {
	
	@Column	(length = 100, nullable=false)
		private String name;
	
	@Column	(length = 50, nullable=false)
	private String city;
	
	
	@Column(length =5)
	private  int fees;


}



