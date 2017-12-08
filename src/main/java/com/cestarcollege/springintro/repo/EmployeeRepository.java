package com.cestarcollege.springintro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cestarcollege.springintro.model.Employee;
@Repository("employeeRepository")
public interface EmployeeRepository 
	extends JpaRepository<Employee, Long> {
	

}
