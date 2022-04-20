package com.cerc.paymentsRegister.Utils;

import java.time.LocalDate;

import com.cerc.paymentsRegister.model.Employee;

public class EmployeeUtils {
	
	private static final String employeeName = "EmployeeTest";
	
	public static Employee generateEmployee() {
		
		Employee employeeTest = new Employee(null, employeeName, PositionUtils.generatePosition(), true, LocalDate.of(2022,04,18), 168.0);
		return employeeTest;
		
	}
}