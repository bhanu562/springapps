package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AddressDTo;
import com.example.demo.entities.Address;
import com.example.demo.entities.StudentInformation;
import com.example.demo.mappers.AddressMapper;
import com.example.demo.service.Service;



@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	Service service;
	@Autowired
	AddressMapper mapper;
	@PostMapping(value = "/updateaddr")
	public ResponseEntity<String> updateAddress( AddressDTo addrdto) {
		StudentInformation std = service.getStudent(addrdto.getStudentId());
		service.updateAddress(mapper.convertAddr(addrdto, std));
		return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);
	}
	@PostMapping(value = "/addaddr")
	public ResponseEntity<String> addAddress( AddressDTo addrdto) {
		StudentInformation std = service.getStudent(addrdto.getStudentId());
		
		service.AddAddress(mapper.convertAddr(addrdto, std));
		return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);
	}
	@GetMapping(value = "/getstudents")
	public List<StudentInformation> getAllStudents() {
		List<StudentInformation> stds = service.getAllStudents();
		return stds;
	}
	@PostMapping(value = "/addstudent")
	public ResponseEntity<String> addStudent(StudentInformation std) {
		 service.addStudent(std);
		return new ResponseEntity<>("Student Added", HttpStatus.OK);
	}
	@GetMapping(value = "/getalladdrofstudent/{id}")
	public List<Address> getAllAddrOfStudents(@PathVariable int id) {
		StudentInformation std = service.getStudent(id);
		return std.getOb();
	}

}
