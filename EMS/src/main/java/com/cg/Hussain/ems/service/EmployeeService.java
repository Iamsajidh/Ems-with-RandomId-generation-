package com.cg.Hussain.ems.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Hussain.ems.model.Employee;
import com.cg.Hussain.ems.repository.AddressRepository;
import com.cg.Hussain.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AddressRepository addressRepo;
	
	public Employee createEmployee(Employee emp)
	{
		
		return employeeRepository.save(emp);
		
		
	}
	
	public List <Employee> getEmployees()
	{
		return employeeRepository.findAll();
	}
	
	
	
	public void deleteEmployee(int empid)
	{
	 employeeRepository.deleteById(empid);
	}
	
	public Employee updateEmployee(int empid, Employee employeeDetails)
	{
		Employee emp = employeeRepository.findById(empid).get();
		emp.setId(employeeDetails.getId());
		emp.setName(employeeDetails.getName());
		emp.setDepartment(employeeDetails.getDepartment());
		emp.setDesignation(employeeDetails.getDesignation());
		return employeeRepository.save(emp);
	}
	
}
	
	
	
	