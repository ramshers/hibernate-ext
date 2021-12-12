package com.demo.model.oneclasstwotables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

//one class two tables

@Entity
@Table(name="Customer")
@SecondaryTable(name="CustomerDetail")
public class Customer {
  
  @Id
  @GeneratedValue
  private int customerId;
  
  private String customerName;
  
  @Column(table="CustomerDetail")
  private String customerAddress;
  
  private int creditScore;
  
  private int rewardsPoints;

}
