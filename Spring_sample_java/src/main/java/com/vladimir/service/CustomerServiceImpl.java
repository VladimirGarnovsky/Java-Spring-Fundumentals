package com.vladimir.service;

import java.util.List;

import com.vladimir.model.Customer;
import com.vladimir.repository.CustomerRepository;
import com.vladimir.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository;
	
	
	/* (non-Javadoc)
	 * @see com.vladimir.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
