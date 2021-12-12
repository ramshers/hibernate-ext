package com.demo.model.compoundpk;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class CompoundKey implements Serializable {
  
  private int userId;
  
  private int accountId;

}
