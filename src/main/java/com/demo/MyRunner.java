package com.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.map_many2many.Delegate;
import com.demo.model.map_many2many.Event;
import com.demo.model.map_one2many.College;
import com.demo.model.map_one2many.Student;
import com.demo.model.map_one2one.Person;
import com.demo.model.map_one2one.PersonDetails;
import com.demo.repo.CollegeRepo;
import com.demo.repo.DelegateRepo;
import com.demo.repo.EventRepo;
import com.demo.repo.PersonRepo;
import com.demo.repo.StudentRepo;

@Component
public class MyRunner implements CommandLineRunner {
  
  @Autowired
  PersonRepo pr;
  
  @Autowired
  EventRepo er;
  
  @Autowired
  DelegateRepo dr;

  //@Override
  public void run1(String... args) throws Exception {

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

  @Autowired 
  CollegeRepo collegeRepo;
  
  @Autowired
  StudentRepo studentRepo;
  
  @Override  //1+n problem
  @Transactional
  public void run(String... args) throws Exception {
	  
	  /**
	  College c = new College();  
	  c.setCollegeName("college4");
	  College cc1= collegeRepo.save(c);
	  System.err.println("cc1.id: " + cc1.getCollegeId());
	  */
	  
	  
	  /**
	  Student s = new Student();
	  s.setStudentName("student4");
	  Optional<College> cdb2 = collegeRepo.findByCollegeId(2);
	  s.setCollege(cdb2.get());
	  studentRepo.save(s); 
	  */
	  
	  System.err.println("1+n queries start" );
	  
	  //cdb1 - college from db
	  Optional<College> cdb = collegeRepo.findByCollegeId(2);
	  System.err.println("cdb.get().getCollegeId(): " + cdb.get().getCollegeId());
	  System.err.println("cdb.get().getCollegeId(): " + cdb.get().getStudents());

	  collegeRepo.findByCollegeIdJPQL().forEach(System.err::println);;
	  
  }

}
