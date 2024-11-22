package com.example.employeesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
