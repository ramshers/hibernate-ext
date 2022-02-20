package com.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.demo.model.map_one2many.Student;

@Repository
public interface StudentRepo  extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {

/**
* Find an Student based on a given studentId.
*/
public Optional<Student> findByStudentId(int studentId);
 

}
