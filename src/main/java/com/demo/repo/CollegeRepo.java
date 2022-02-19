package com.demo.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.demo.model.map_one2many.College;
import com.demo.model.map_one2one.Person;

@Repository
public interface CollegeRepo  extends JpaRepository<College, Integer>, JpaSpecificationExecutor<Person> {

/**
* Find an College based on a given collegeId.
*/
public Optional<Person> findByCollegeId(int collegeId);
 

}
