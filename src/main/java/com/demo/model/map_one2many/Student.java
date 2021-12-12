package com.demo.model.map_one2many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
  
  @Id
  @GeneratedValue
  private int studentId;
  
  private String studentName;
  
  @ManyToOne
  @JoinColumn(name="collegeId_fk")
  private College college;
  
}
