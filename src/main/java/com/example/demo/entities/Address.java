package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//Adding the table name
@Table(name = "Address")
public class Address {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String cityname;

 // Mapping the column of this table 
 @ManyToOne
 //Adding the name
 @JoinColumn(name = "studentId",referencedColumnName = "rollno")
 StudentInformation std;

 Address() {}

 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCityname() {
	return cityname;
}

public void setCityname(String cityname) {
	this.cityname = cityname;
}



@Override
public String toString() {
	return "Address [id=" + id + ", cityname=" + cityname + ", ob=" + std + "]";
}

public Address(int id, String cityname, StudentInformation ob1)
 {
     this.id = id;
     this.cityname = cityname;
     this.std = ob1;
 }
}