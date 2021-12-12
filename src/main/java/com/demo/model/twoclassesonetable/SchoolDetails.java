package com.demo.model.twoclassesonetable;

import javax.persistence.Embeddable;

//don't put entity annotation here instead put below annotation
@Embeddable
public class SchoolDetails {
  
  private String schoolDetails;
  private boolean isPublicSchool;
  private int studentCount;

}
