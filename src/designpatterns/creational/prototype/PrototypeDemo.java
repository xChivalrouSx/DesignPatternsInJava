package designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	public static void run() {
		runPrototypeStatementExample();
		runPrototypeItemExample();
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
	
	private static void runPrototypeItemExample() {
		Registry registry = new Registry();
		MovieItem movieItem = (MovieItem) registry.createItem("Movie");
		movieItem.setTitle("Prototype Movie");
		
		System.out.println(movieItem);
		System.out.println(movieItem.getRuntime());
		System.out.println(movieItem.getTitle());
		System.out.println(movieItem.getUrl());
		
		MovieItem anotherMovieItem = (MovieItem) registry.createItem("Movie");
		anotherMovieItem.setTitle("Prototype Another Movie");
		
		System.out.println(anotherMovieItem);
		System.out.println(anotherMovieItem.getRuntime());
		System.out.println(anotherMovieItem.getTitle());
		System.out.println(anotherMovieItem.getUrl());
	}
}
