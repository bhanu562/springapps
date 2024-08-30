package com.example.demo.entities;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
//Adding the table name
@Table(name = "Student")
public class StudentInformation {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int rollno;
 private String name;

 // Mapping to the other table
 @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER ,mappedBy = "std")
 @JsonIgnore
 private List<Address> ob;
 public int getRollno() { return rollno; }

 public StudentInformation() {}

 public StudentInformation(int rollno, String name)
 {
     this.rollno = rollno;
     this.name = name;
 }



public void setRollno(int rollno)
 {

     this.rollno = rollno;
 }

 public List<Address> getOb() {
	return ob;
}

public void setOb(List<Address> ob) {
	this.ob = ob;
}

@Override
public String toString() {
	return "StudentInformation [rollno=" + rollno + ", name=" + name + "]";
}

public String getName() { return name; }
 

 public void setName(String name) { this.name = name; }
}