package com.cg.Hussain.ems;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.Hussain.ems.model.Address;
import com.cg.Hussain.ems.model.Employee;
import com.cg.Hussain.ems.repository.EmployeeRepository;
import com.cg.Hussain.ems.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class MainTests {
	
	@Autowired
	public EmployeeService employeeService;
	
	@MockBean
	public EmployeeRepository empRepo;
	
	
	@Test
	public void  getEmployeesTest() {
		
		when(empRepo.findAll()).thenReturn(Stream.of(new Employee(201, "Sajid Hussain", "Cloud & Custom Application", "Analyst", new Address(201, "Bhumiraj Meadwos","Third", "Mumbai", 400708))).collect(Collectors.toList()));
		assertEquals(1,employeeService.getEmployees().size());
		
	}

}
