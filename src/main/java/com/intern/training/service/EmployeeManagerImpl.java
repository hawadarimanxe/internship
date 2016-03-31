package com.intern.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.training.api.EmployeeManager;
import com.intern.training.api.domain.Employee;
import com.intern.training.repository.EmployeeRepository;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addNew(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> addAll(List<Employee> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee remove(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBy(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		
		return this.employeeRepository.findAll();
	}

	@Override
	public List<Employee> findWithPaging(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
