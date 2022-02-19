package com.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.map_one2many.College;

@Repository
public interface CollegeRepo  extends JpaRepository<College, Integer>, JpaSpecificationExecutor<College> {

/**
* Find an College based on a given collegeId.
*/

	public Optional<College> findByCollegeId(int collegeId);
	
	@Query("SELECT c FROM College c JOIN FETCH c.students where c.collegeId=1")
	public List<College> findByCollegeIdJPQL();
 

}
