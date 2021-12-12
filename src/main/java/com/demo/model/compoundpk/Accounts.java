package com.demo.model.compoundpk;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {
  
  @Id
  private CompoundKey compoundKey;
  
  private int accountBalance;

}
