package com.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Converter;

import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.model.CustomerDTO;
import com.repository.CustomerRepository;
import com.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository = null;
	
	private final CustomerRepository eventRepository = null;
	private final Converter converter = null;

	//to save detail
	
	public String createCustomer1(Customer customer) {
		String message = null;
		customerRepository.save(customer);
		if(customer!=null)
		{
			message= "customer details saved successfully";
		}
		return message;
	}

	//UPDATE
	public  CustomerServiceImpl(int id, Customer customer) {
		Customer existingCustomer=customerRepository.findById(id).orElseThrow();
			existingCustomer.setCustomerName(customer.getCustomerName());
			existingCustomer.setPhone(customer.getPhone());
			existingCustomer.setEmail(customer.getEmail());
			
			customerRepository.save(existingCustomer);
			
			System.out.println("Customer Updated successfully");
			
			return ;
	}

	@Override
	public CustomerDTO getCustomerByID(int id) {
		
		Optional<Customer> getCustomer = customerRepository.findById(id);
				
	
		return null ;
	}

	
	//getting details by using names 
	@Override
	public List<CustomerDTO> getCustomerByName(String customerName) {
		List<Customer> customer=customerRepository.getCustomerByName(customerName);
		List<CustomerDTO> customerDTO = new ArrayList<>();
		for(Customer s: customer)
		{
			customerDTO.add(converter.convertToCustomerDTO(s));
		}
		return customerDTO;
	}

	public List<CustomerDTO> getCustomerByEmail(String email) {
		List<Customer> customer=customerRepository.getCustomerByEmail(email);
		List<CustomerDTO> customerDTO=new ArrayList<>();
		for(Customer e: customer)
		{
			customerDTO.add(converter.convertToCustomerDTO(e));
		}
			return customerDTO;
	}

	@Override
	public String createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO updateCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomertByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> getCustomerbyEMAil(String emailAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO assignAddressToStudent(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerDTO updateCustomer(int id, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
