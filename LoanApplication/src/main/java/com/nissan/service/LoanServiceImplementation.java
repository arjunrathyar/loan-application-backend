package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.Validation;
import com.nissan.model.Loan;
import com.nissan.repo.ILoanRepo;

@Service
public class LoanServiceImplementation implements ILoanService {

	@Autowired
	private ILoanRepo loanRepo;

	@Autowired
	private Validation validation;

	@Override
	public List<Loan> getLoan() {
		// TODO Auto-generated method stub
		return (List<Loan>) loanRepo.findAll();
	}

}
