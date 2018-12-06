package com.vladimir.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vladimir.model.Customer;

@Repository(value="customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
	List<Customer> customers = new ArrayList<Customer>();

	public List<Customer> findAll(){
		Customer customer = new Customer();
		customer.setName("Ziomek");
		
		customers.add(customer);
		return customers;
	}
}
