package com.intern.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.training.api.StudentManager;
import com.intern.training.api.domain.Student;
import com.intern.training.repository.StudentRepository;

@Service
public class StudentManagerImpl implements StudentManager {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addNew(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> addAll(List<Student> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student remove(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBy(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public List<Student> findWithPaging(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
