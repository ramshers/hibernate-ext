package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.demo.model.map_many2many.Delegate;

public interface DelegateRepo extends JpaRepository<Delegate, Integer>, JpaSpecificationExecutor<Delegate>{

}
