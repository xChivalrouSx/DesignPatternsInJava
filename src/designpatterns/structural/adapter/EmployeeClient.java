package designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDb = new EmployeeDb("1", "FirstName", "LastName", "Email");
		employees.add(employeeFromDb);
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("2", "TestFirstName", "TestLastName", "TestEmail");
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("3,TestName,TestSurname,TestMail");
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employees;
	}
}
