package com.demo.model;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

//more annotations

@Entity
public class Employee {

  @Id
  @TableGenerator(name="empid", table="emppktb", pkColumnName="empkey", pkColumnValue="empvalue", allocationSize=1)
  @GeneratedValue(strategy=GenerationType.TABLE, generator="empid")
  private int empId;
  
  private String empName;
  
  @Transient
  private String empPassword; 
  
  @Column(nullable=false)
  private String empEmailAddress;
  
  @Basic
  private boolean isPermanent;
  
  @Temporal(TemporalType.DATE)
  private Calendar empJoinDate;
  
  @Temporal(TemporalType.TIMESTAMP)
  private Date empLoginTime;
  
  public int getEmpId() {
    return empId;
  }
  public void setEmpId(int empId) {
    this.empId = empId;
  }
  public String getEmpName() {
    return empName;
  }
  public void setEmpName(String empName) {
    this.empName = empName;
  }

}


