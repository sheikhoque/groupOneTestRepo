package com.cestarcollege.springintro.service;

import java.util.List;

import com.cestarcollege.springintro.model.Employee;

public interface EmployeeService {
	Employee getEmployeeById(long id);
	List<Employee> getAllEmployees();
	Employee save(Employee e);
}
