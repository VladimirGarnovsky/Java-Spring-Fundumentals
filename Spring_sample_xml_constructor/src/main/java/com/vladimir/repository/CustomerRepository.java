package com.vladimir.repository;

import java.util.List;

import com.vladimir.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}