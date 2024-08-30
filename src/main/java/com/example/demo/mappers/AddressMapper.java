package com.example.demo.mappers;

import org.springframework.stereotype.Component;

import com.example.demo.dto.AddressDTo;
import com.example.demo.entities.Address;
import com.example.demo.entities.StudentInformation;
@Component
public class AddressMapper {
	
 public Address convertAddr(AddressDTo dto,StudentInformation st) {
	 Address addr=new Address(dto.getId(), dto.getCityName(),st);
	return addr;
	 
 }
}
