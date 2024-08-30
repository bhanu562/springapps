package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Address;
import com.example.demo.entities.StudentInformation;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
