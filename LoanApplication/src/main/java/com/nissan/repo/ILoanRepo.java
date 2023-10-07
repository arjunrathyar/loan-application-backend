package com.nissan.repo;

import org.springframework.data.repository.CrudRepository;

import com.nissan.model.Loan;

public interface ILoanRepo extends CrudRepository<Loan, Integer>{

}
