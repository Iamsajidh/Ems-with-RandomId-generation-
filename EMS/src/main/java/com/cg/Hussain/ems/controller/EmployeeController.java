package com.cg.Hussain.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Hussain.ems.model.Employee;
import com.cg.Hussain.ems.service.EmployeeService;
import com.cg.Hussain.ems.service.SeqGeneratorService;



@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@Autowired
	private SeqGeneratorService sequenceGeneratorService;
	
	@RequestMapping(value="/employees", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp)
	{
		int id = sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME);
		emp.setId(id);
		emp.getAddress().setId(id);
		return employeeService.createEmployee(emp);
	}
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public List <Employee> readEmployees()
	{
		return employeeService.getEmployees();
	}
	
	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.PUT)
	public Employee readEmployees(@PathVariable(value = "empId") int id, @RequestBody Employee empDetails)
	
	{
		return employeeService.updateEmployee(id, empDetails);
		
	}
	
	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable(value = "empId") int id)
	{
		employeeService.deleteEmployee(id);
	}
	
	
}
