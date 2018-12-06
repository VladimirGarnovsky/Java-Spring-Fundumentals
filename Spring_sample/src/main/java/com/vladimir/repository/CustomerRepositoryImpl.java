package com.vladimir.repository;

import java.util.ArrayList;
import java.util.List;

import com.vladimir.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	List<Customer> customers = new ArrayList<Customer>();
	
	/* (non-Javadoc)
	 * @see com.vladimir.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll(){
		Customer customer = new Customer();
		customer.setName("Ziomek");
		
		customers.add(customer);
		return customers;
	}
}
