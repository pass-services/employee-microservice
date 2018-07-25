package com.passservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passservices.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
