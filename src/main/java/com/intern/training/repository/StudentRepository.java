package com.intern.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.intern.training.api.domain.Student;

@Transactional(readOnly = true)
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
