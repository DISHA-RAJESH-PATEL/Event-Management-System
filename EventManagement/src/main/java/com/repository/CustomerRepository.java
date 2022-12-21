package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.Customer;



public interface CustomerRepository {
	// custom  getter
	
		@Query("from Customer where lower(cusName) like :s%")	
		List<Customer> getCustomerByName(@Param("c") String cusName); 
		
		@Query("from Customer where email=:e")
		List<Customer> getCustomerByEmail(@Param("e") String email);

		void save(Customer customer);

		Optional<Customer> findById(int id);
	}



