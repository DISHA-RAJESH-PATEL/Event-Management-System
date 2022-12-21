package com.service;

import java.util.List;

import com.entity.Customer;
import com.model.CustomerDTO;

public interface CustomerService {
	String createCustomer(Customer customer);
	public CustomerDTO updateCustomer(int id );
	CustomerDTO getCustomerByID(int id );
	String deleteCustomertByID(int id);
	List<CustomerDTO> getAllCustomer();
	 void deleteAllCustomer(); 
	 
	 List<CustomerDTO>getCustomerByName(String CustomerName);
	 List<CustomerDTO> getCustomerbyEMAil(String emailAddress);
	 
	 CustomerDTO assignAddressToStudent(int id , String name);
	CustomerDTO updateCustomer(int id, Customer customer);
	List<CustomerDTO> getCustomerByEmail(String email);
	 

}
