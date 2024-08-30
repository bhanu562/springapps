package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Address;
import com.example.demo.entities.StudentInformation;
import com.example.demo.repos.AddressRepo;
import com.example.demo.repos.StudentRepo;

@org.springframework.stereotype.Service
public class ServiceIZmpl implements Service {
	@Autowired
	AddressRepo addrRepo;
	@Autowired
	StudentRepo studentRepo;

	@Override
	public List<StudentInformation> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Address updateAddress(Address addr) {
		return addrRepo.save(addr);
		
	}

	@Override
	public List<Address> getAddressesOfStdent(int id) {
		// TODO Auto-generated method stub
		
		Optional<StudentInformation> st = studentRepo.findById(id);
		System.out.println(st.isPresent() ? st.get() :null);
		//return studentRepo.findById(id).get().getob();
		//st.get().
		return null;
	}

	@Override
	public Address AddAddress(Address addr) {
		return addrRepo.save(addr);
		
	}

	@Override
	public StudentInformation addStudent(StudentInformation std) {
		// TODO Auto-generated method stub
		return studentRepo.save(std);
	}

	@Override
	public StudentInformation getStudent(int id) {
		// TODO Auto-generated method stub
		Optional<StudentInformation> st = studentRepo.findById(id);
		
		return st.isPresent() ? st.get() :null ;
	}

}
