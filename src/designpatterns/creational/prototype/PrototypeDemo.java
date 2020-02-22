package designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	public static void run() {
		runPrototypeStatementExample();
	}
	
	private static void runPrototypeStatementExample() {
		String sql = "SELECT * FROM movies WHERE title = ?";
		
		Statement.Record record = new Statement.Record();
		
		List<String> parameters = new ArrayList<>();
		parameters.add("Star Wars");
		
		Statement firstStatement = new Statement(sql, parameters, record);
		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());
		
		Statement secondStatement = firstStatement.clone();
		System.out.println(secondStatement.getSql());
		System.out.println(secondStatement.getParameters());
		System.out.println(secondStatement.getRecord());
	}
}
