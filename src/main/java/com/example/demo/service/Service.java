package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Address;
import com.example.demo.entities.StudentInformation;

public interface Service {
  List< StudentInformation> getAllStudents();
  Address updateAddress(Address addr);
   List<Address> getAddressesOfStdent(int id);
   Address AddAddress(Address addr);
   StudentInformation addStudent(StudentInformation std);
   StudentInformation getStudent(int id);
}

