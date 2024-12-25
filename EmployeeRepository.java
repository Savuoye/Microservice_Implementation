package com.infotech.fisglobal.employee.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.howtodoinjava.example.employee.beans.Employee;

public class EmployeeRepository {

	private List<Employee> employees = new ArrayList<Employee>();

	public Employee add(Employee employee) {
		employee.setId((long) (employees.size() + 1));
		employees.add(employee);
		return employee;
	}

	public List<Employee> findAll() {
		return employees;
	}

	public Employee findById(Long id) {
		Optional<Employee> employee = employees.stream().filter(a -> a.getId().equals(id)).findFirst();
		if (employee.isPresent())
			return employee.get();
		else
			return null;
	}

}
