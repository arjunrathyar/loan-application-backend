package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.Validation;
import com.nissan.model.Customer;
import com.nissan.repo.ICustomerRepo;

@Service
public class CustomerServiceImplementation implements ICustomerService {

 
	@Autowired
	private ICustomerRepo customerRepo;

	@Autowired
	private Validation validation;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepo.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if (validation.isNameValid(customer.getCustomerName())) {
			//System.out.println(customer.getDepartmentId());
			return customerRepo.save(customer);
		}
		return null;
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Customer Not Found with id: " + id));
	}

	
	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Customer cust = getCustomer(id);
		cust.setActive(false);
		customerRepo.save(cust);
	}

	@Override
	public List<Customer> getRequestedCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepo.getRequestedCustomers();
	}

	@Override
	public List<Customer> getVisitedCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepo.getVisitedCustomers();
	}

}
