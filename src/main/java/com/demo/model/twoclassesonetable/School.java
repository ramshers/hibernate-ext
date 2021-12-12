package com.demo.model.twoclassesonetable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//two classes one table


@Entity
public class School {

  @Id
  @GeneratedValue
  private int schoolId;
  
  private int schoolName;
  
  @Embedded
  private SchoolDetails schoolDetails;
  
}
