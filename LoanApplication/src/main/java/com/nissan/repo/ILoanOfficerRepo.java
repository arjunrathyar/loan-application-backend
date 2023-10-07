package com.nissan.repo;

import org.springframework.data.repository.CrudRepository;

import com.nissan.model.LoanOfficer;

public interface ILoanOfficerRepo extends CrudRepository<LoanOfficer, Integer>{

}
