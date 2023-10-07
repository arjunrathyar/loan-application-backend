package com.nissan.service;

import java.util.List;

import com.nissan.model.Customer;

public interface ICustomerService {

	// list
	public List<Customer> getCustomer();

	// insert
	public Customer saveCustomer(Customer customer);

	// update by id
	public Customer getCustomer(int id);

	// delete
	public void deleteCustomer(int id);

	public List<Customer> getRequestedCustomers();

	public List<Customer> getVisitedCustomers();


}
