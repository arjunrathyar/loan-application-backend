package com.nissan.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;
import com.nissan.model.Customer;
import com.nissan.service.ICustomerService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CustomerController {

	//@Autowired
	//private JwtUtil jwtUtil;

	@Autowired
	private ICustomerService customerService;

	@Autowired
	private APIResponse apiresponse;

	// list

	@GetMapping("/customers")
	public List<Customer> getCustomer(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verify(auth);
		return customerService.getCustomer();
	}
	
	@GetMapping("/requestedcustomers")
	public List<Customer> getRequestedCustomers(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verifyAdmin(auth);
		return customerService.getRequestedCustomers();
	}
	
	@GetMapping("/visitedcustomers")
	public List<Customer> getVisitedCustomers(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verifyAdmin(auth);
		return customerService.getVisitedCustomers();
	}

	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		return customerService.getCustomer(id);
	}

	@PostMapping("/customers")
	public ResponseEntity<APIResponse> addCustomer(@RequestBody Customer customer,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		if (customerService.saveCustomer(customer) == null) {
			apiresponse.setData("Name can have only alphabets!!");
			apiresponse.setStatus(500);
			apiresponse.setError("Invalid Name");

			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
		}
		apiresponse.setData("Customer added successfully!!");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
	}

	@PutMapping("/customers")
	public ResponseEntity<APIResponse> updateCustomer(@RequestBody Customer customer,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		if (customerService.saveCustomer(customer) == null) {
			apiresponse.setData("Name can have only alphabets!!");
			apiresponse.setStatus(500);
			apiresponse.setError("Invalid Name");

			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
		}
		apiresponse.setData("Customer added successfully!!");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);

	}

	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable int id,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		customerService.deleteCustomer(id);
	}

}
