package com.demo.model.map_many2many;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Delegate {
  
  @Id
  //@GeneratedValue
  private int delegateId;
  
  private String delegateName;
  
  public Delegate() {  }

  public Delegate(int delegateId, String delegateName) {
    super();
    this.delegateId = delegateId;
    this.delegateName = delegateName;
  }

  @ManyToMany
  @JoinTable(name="join_delegate_event", 
          joinColumns={@JoinColumn(name="delegateId_jc")},
          inverseJoinColumns={@JoinColumn(name="eventId_jc")})
  private List<Event> events = new ArrayList<>();

  public int getDelegateId() {
    return delegateId;
  }

  public void setDelegateId(int delegateId) {
    this.delegateId = delegateId;
  }

  public String getDelegateName() {
    return delegateName;
  }

  public void setDelegateName(String delegateName) {
    this.delegateName = delegateName;
  }

  public List<Event> getEvents() {
    return events;
  }

  public void setEvents(List<Event> events) {
    this.events = events;
  }

}
