package com.ajith.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajith.model.EmployeeModel;

public interface EmployeRepository extends JpaRepository<EmployeeModel, Integer>{

}
