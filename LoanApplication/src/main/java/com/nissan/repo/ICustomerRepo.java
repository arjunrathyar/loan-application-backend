package com.nissan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nissan.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer>{

	@Query("SELECT cust FROM Customer cust WHERE cust.statusId = 3 AND cust.loanOfficerId=1")
	List<Customer> getRequestedCustomers();
	
	
	@Query("SELECT cust FROM Customer cust WHERE cust.statusId = 3 AND cust.loanOfficerId=2 AND LEN(cust.feedback)>3")
	List<Customer> getVisitedCustomers();
	
	//@Query("SELECT cust FROM Customer cust WHERE cust.isActive = true")
	//public List<Customer> getActiveCustomers();

}
