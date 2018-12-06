package com.vladimir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vladimir.model.Customer;
import com.vladimir.repository.CustomerRepository;

@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("Annotation constructor injection");
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Annotation setter injection");
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
