package com.demo.model.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //this default strategy.
@Inheritance(strategy = InheritanceType.JOINED) // Preferred. // Module and Task tables have projectId column
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // base class/tables data is duplicated in the extended class/tables.
public class Project {

  @Id
  @GeneratedValue
  private int projectId;
  
  private String projectName;
  
}
