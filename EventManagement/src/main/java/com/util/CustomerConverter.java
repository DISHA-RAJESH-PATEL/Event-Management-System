package com.util;

import org.springframework.beans.BeanUtils;

import com.entity.Customer;
import com.model.CustomerDTO;



public class CustomerConverter {
	//convert CustomerDTO to Entity(Customer)
	public Customer convertToEntity(CustomerDTO  customerDTO) 
	{
		Customer customer = new Customer();
		if(customerDTO!=null)
		{
			BeanUtils.copyProperties(customerDTO, customer);
		}
		return customer;
	}
	
	//convert Entity(customer) to CustomerDTO
	
public CustomerDTO	convertToCustomerDTO(Customer customer)
{
	CustomerDTO customerDTO = new CustomerDTO();
	if(customer!=null)
	{
		BeanUtils.copyProperties(customer, customerDTO);
	}
	return customerDTO;
}

}
