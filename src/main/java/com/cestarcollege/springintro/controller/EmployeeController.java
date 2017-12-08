package com.cestarcollege.springintro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cestarcollege.springintro.model.Employee;
import com.cestarcollege.springintro.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);
	}
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Employee getEmployee(Employee e) {
		return employeeService.save(e);
	}
    
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Employee deleteEmployee(Employee e) {
		return null;
	}

}
