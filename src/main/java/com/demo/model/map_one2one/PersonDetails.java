package com.demo.model.map_one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonDetails {
  
  @Id
  @GeneratedValue
  @Column(name="personDetailsId")
  private int personDetailsId;
  
  //for bi-directional one to one you need this
  @OneToOne(mappedBy="personDetails", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
  private Person person;
  
  private String zipCode;
  
  private String job;
  
  private double income;

  public int getPersonDetailsId() {
    return personDetailsId;
  }

  public void setPersonDetailsId(int personDetailsId) {
    this.personDetailsId = personDetailsId;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public double getIncome() {
    return income;
  }

  public void setIncome(double income) {
    this.income = income;
  }

}
