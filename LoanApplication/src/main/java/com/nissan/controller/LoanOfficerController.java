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
import com.nissan.model.LoanOfficer;
import com.nissan.service.ILoanOfficerService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanOfficerController {
	
	@Autowired
	private ILoanOfficerService loanOfficerService;

	@Autowired
	private APIResponse apiresponse;

	// list

	@GetMapping("/loanofficers")
	public List<LoanOfficer> getLoanOfficer(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verify(auth);
		return loanOfficerService.getLoanOfficer();
	}

}
