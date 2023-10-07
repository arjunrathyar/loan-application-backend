package com.nissan.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;
import com.nissan.model.Loan;
import com.nissan.service.ILoanService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanController {
	
	@Autowired
	private ILoanService loanService;

	@Autowired
	private APIResponse apiresponse;

	// list

	@GetMapping("/loans")
	public List<Loan> getLoan(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verify(auth);
		return loanService.getLoan();
	}

}
