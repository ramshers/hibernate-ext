package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.demo.model.map_many2many.Delegate;
import com.demo.model.map_many2many.Event;
import com.demo.model.map_one2one.Person;
import com.demo.model.map_one2one.PersonDetails;
import com.demo.repo.DelegateRepo;
import com.demo.repo.EventRepo;
import com.demo.repo.PersonRepo;

@Component
public class MyRunner implements CommandLineRunner {
  
  @Autowired
  PersonRepo pr;
  
  @Autowired
  EventRepo er;
  
  @Autowired
  DelegateRepo dr;

  @Override
  public void run(String... args) throws Exception {

    PersonDetails pd = new PersonDetails();
    pd.setPersonDetailsId(11);
    pd.setJob("Space Programmer");
    pd.setZipCode("77777");
    pd.setIncome(9999999);
         
    Person p = new Person();
    p.setPersonId(1);
    p.setPersonName("John");
    p.setPersonDetails(pd);

    System.err.println("entity saving....");

    pr.save(p);
    
    System.err.println("entity saved");
    
    Event e1 = new Event(1, "Event-1");
    Event e2 = new Event(2, "Event-2");
    Event e3 = new Event(3, "Event-3");
    Event e4 = new Event(4, "Event-4");
    
    Delegate d1 = new Delegate(1, "Delegate-1");
    Delegate d2 = new Delegate(2, "Delegate-2");
    Delegate d3 = new Delegate(3, "Delegate-3");  
    Delegate d4 = new Delegate(4, "Delegate-4");  
    
    e1.getDelegates().add(d1);
    e1.getDelegates().add(d2);
    e1.getDelegates().add(d4);
    
    e2.getDelegates().add(d1);
    e2.getDelegates().add(d4);
    
    dr.save(d1);
    dr.save(d2);
    //dr.save(d3);
    dr.save(d4);

    er.save(e2);

    er.save(e1);
    
  }

}
