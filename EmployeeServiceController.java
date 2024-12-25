package com.howtodoinjava.example.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.example.employee.beans.Employee;
import com.infotech.fisglobal.employee.repository.EmployeeRepository;

@RestController
public class EmployeeServiceController {

	@Autowired
	EmployeeRepository repository;

	private static final Map<Integer, Employee> employeeData = new HashMap<Integer, Employee>() {
		/**
		 * 
		 */
		/*
		 * private static final long serialVersionUID = -3970206781360313502L;
		 * 
		 * { put(111, new Employee(111, "Employee1")); put(222, new Employee(222,
		 * "Employee2")); put(333, new Employee(333, "Employee3")); put(444, new
		 * Employee(444, "Employee4")); put(555, new Employee(555, "Employee5"));
		 * put(666, new Employee(666, "Employee6")); put(777, new Employee(222,
		 * "Employee7")); put(888, new Employee(777, "Employee8")); put(999, new
		 * Employee(999, "Employee9")); put(1000, new Employee(1000, "Employee10"));
		 * put(1011, new Employee(1011, "Employee11")); put(1022, new Employee(1022,
		 * "Employee12")); put(1033, new Employee(1033, "Employee13"));
		 * 
		 * put(1044, new Employee(1044, "Employee14")); put(1055, new Employee(1055,
		 * "Employee15")); put(1066, new Employee(1066, "Employee16")); put(1077, new
		 * Employee(1077, "Employee17")); put(1088, new Employee(1088, "Employee18"));
		 * put(1099, new Employee(1099, "Employee19")); put(2000, new Employee(2000,
		 * "Employee20"));
		 * 
		 * }
		 */

	};

	/*
	 * @RequestMapping(value = "/findEmployeeDetails/{employeeId}", method =
	 * RequestMethod.GET) public Employee getEmployeeDetails(@PathVariable int
	 * employeeId) { System.out.println("Getting Employee details for " +
	 * employeeId);
	 * 
	 * Employee employee = employeeData.get(employeeId); if (employee == null) {
	 * 
	 * employee = new Employee(0, "N/A");
	 * 
	 * } return employee; }
	 */

	@GetMapping("/employee")
	public List<Employee> findAll() {
		return repository.findAll();
	}

}
