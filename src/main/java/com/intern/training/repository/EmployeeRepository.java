package com.intern.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.training.api.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
