package com.cestarcollege.springintro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cestarcollege.springintro.model.Employee;
import com.cestarcollege.springintro.repo.EmployeeRepository;
import com.cestarcollege.springintro.service.EmployeeService;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee save(Employee e) {
		return employeeRepository.save(e);
	}

}
