package designpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

	private AdapterDemo() {}
	
	public static void run() {
		runArraysAsListExample();
		runEmployeeAdapterExample();
	}
	
	private static void runArraysAsListExample() {
		Integer[] array = new Integer[] {0, 1, 2, 3, 4, 5};
		List<Integer> list = Arrays.asList(array);
		
		System.out.println(array);
		System.out.println(list);
	}
	
	private static void runEmployeeAdapterExample() {
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();
		
		System.out.println(employees);
	}
}
