package com.demo.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import com.demo.model.map_one2one.Person;

@Repository
public interface PersonRepo  extends JpaRepository<Person, Integer>, JpaSpecificationExecutor<Person> {

/**
* Find an Person based on a given personId.
*/
public Optional<Person> findByPersonId(int personId);
 

}
