package com.vladimir.service;

import java.util.List;

import com.vladimir.model.Customer;
import com.vladimir.repository.CustomerRepository;

public interface CustomerService {
	
	void setCustomerRepository(CustomerRepository customerRepository);
	List<Customer> findAll();

}