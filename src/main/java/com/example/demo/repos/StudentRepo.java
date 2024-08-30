package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.StudentInformation;

public interface StudentRepo extends JpaRepository<StudentInformation, Integer> {

}
