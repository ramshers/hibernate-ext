package com.demo.model.map_many2many;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Event {
  
  @Id
  //@GeneratedValue
  private int eventId;
  
  private String eventName;
  
  public Event() {  }

  public Event(int eventId, String eventName) {
    super();
    this.eventId = eventId;
    this.eventName = eventName;
  }

  @ManyToMany // over writing if using (cascade=CascadeType.ALL, fetch=FetchType.EAGER)
  @JoinTable(name="join_delegate_event", 
          joinColumns={@JoinColumn(name="eventId_jc")},
          inverseJoinColumns={@JoinColumn(name="delegateId_jc")})
  private List<Delegate> delegates = new ArrayList<>();

  public int getEventId() {
    return eventId;
  }

  public void setEventId(int eventId) {
    this.eventId = eventId;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public List<Delegate> getDelegates() {
    return delegates;
  }

  public void setDelegates(List<Delegate> delegates) {
    this.delegates = delegates;
  }

}
