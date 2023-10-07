package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.Validation;
import com.nissan.model.Status;
import com.nissan.repo.IStatusRepo;

@Service
public class StatusServiceImplementation implements IStatusService {

	@Autowired
	private IStatusRepo statusRepo;

	@Autowired
	private Validation validation;

	@Override
	public List<Status> getStatus() {
		// TODO Auto-generated method stub
		return (List<Status>) statusRepo.findAll();
	}

}
