package com.vladimir.service;

import java.util.List;

import com.vladimir.model.Customer;
import com.vladimir.repository.CustomerRepository;
import com.vladimir.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("CustomerServiceImpl constructor");
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
