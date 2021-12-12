package com.demo.model.map_one2one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {

  @Id
  @GeneratedValue
  private int personId;
  
  private String personName;
  
  //for 121 mapping fetch type is eager by default but for other mappings it defaults to lazy
  @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)  
  @JoinColumn(name = "personDetailsId_fk")
  private PersonDetails personDetails;
  
  public int getPersonId() {
    return personId;
  }

  public void setPersonId(int personId) {
    this.personId = personId;
  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public PersonDetails getPersonDetails() {
    return personDetails;
  }

  public void setPersonDetails(PersonDetails personDetails) {
    this.personDetails = personDetails;
  }

}
