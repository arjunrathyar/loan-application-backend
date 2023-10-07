package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.Validation;
import com.nissan.model.LoanOfficer;
import com.nissan.repo.ILoanOfficerRepo;

@Service
public class LoanOfficerServiceImplementation implements ILoanOfficerService {

	@Autowired
	private ILoanOfficerRepo loanOfficerRepo;

	@Autowired
	private Validation validation;

	@Override
	public List<LoanOfficer> getLoanOfficer() {
		// TODO Auto-generated method stub
		return (List<LoanOfficer>) loanOfficerRepo.findAll();
	}

}
