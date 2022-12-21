package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.CustomerDTO;
import com.service.CustomerService;
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	private final Converter converter;
	
	@PostMapping("/newCustomer")
	public String createCustomer(@RequestBody customerDTO)
	{
		final Customer customer= converter.convertToEntity(customerDTO);
	return customerService.createCustomer(customer);
	}
	
	@PutMapping("/updateCustomer/{id}")
	public CustomerDTO updateCustomer(@PathVariable("id") int  id ,@RequestBody CustomerDTO customerDTO)
	{
	CustomerDTO customer1	=converter.convertToEntity(customerDTO);
		return customerService.updateCustomer(id);
	}

	@GetMapping("/getCustomer/{id}")
	public CustomerDTO Customer(@PathVariable("id") int  id )
	{
		return customerService.getCustomerByID(id);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int id )
	{
		return customerService.deleteCustomertByID(id);
	}
	@GetMapping("/getAllCustomers")
	public List<CustomerDTO> getAllCustomer()
	{
			return customerService.getAllCustomer();
	}
	
	@DeleteMapping("/deleteAllCustomer")
	public void deleteAllCustomer()
	{
		customerService.deleteAllCustomer();
	}
	
	@GetMapping("/getCustomerByName/{name}")
	public List<CustomerDTO> getCustomerByName(@PathVariable("name") String customerName)
	{
			return customerService.getCustomerByName(customerName);
	}
	
	@GetMapping("/getCustomerByEmail/{email}")
	public List<CustomerDTO> getCustomerByEmail(@PathVariable("email") String emailAddress)
	{
		return customerService.getCustomerByEmail(emailAddress);
	}
	
	

}
