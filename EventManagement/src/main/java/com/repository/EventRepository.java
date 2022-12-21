package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customer;
import com.entity.Event;


public interface EventRepository extends JpaRepository<Customer, Integer> {

	static void saveAll(Event event) {
		// TODO Auto-generated method stub
		
	}

}
