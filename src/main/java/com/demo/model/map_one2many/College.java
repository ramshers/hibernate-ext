package com.demo.model.map_one2many;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	@GeneratedValue
	private int collegeId;

	private String collegeName;

	// for 121 mapping fetch type is eager by default but for other mappings it
	// defaults to lazy
	@OneToMany(targetEntity = Student.class, mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Student> students;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
