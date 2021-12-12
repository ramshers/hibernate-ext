package com.demo.model.map_one2many;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
  
  @Id
  @GeneratedValue
  private int collegeId;
  
  private String collegeName;
  
  //for 121 mapping fetch type is eager by default but for other mappings it defaults to lazy
  @OneToMany(targetEntity=Student.class, mappedBy="college", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
  private List<Student> students;

}
