package com.nissan.repo;

import org.springframework.data.repository.CrudRepository;

import com.nissan.model.Status;

public interface IStatusRepo extends CrudRepository<Status, Integer>{

}
