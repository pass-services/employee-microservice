package com.pass-services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pass-services.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
