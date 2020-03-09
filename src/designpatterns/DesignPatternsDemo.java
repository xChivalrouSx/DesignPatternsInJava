package designpatterns;

import java.sql.SQLException;

import designpatterns.creational.CreationalDesignPatterns;
import designpatterns.structural.StructuralDesignPatterns;

public class DesignPatternsDemo {

	public static void main(String args[]) throws SQLException {
		System.out.println("Application started...");
		
		System.out.println("### Creational Demo - START - ###");
		CreationalDesignPatterns.runCreationalDesignPatterns();
		System.out.println("### Creational Demo - END - ###");

		System.out.println("### Structural Demo - START - ###");
		StructuralDesignPatterns.runStructuralDesignPatterns();
		System.out.println("### Structural Demo - END - ###");
		
		System.out.println("Application finished...");
	}
}
