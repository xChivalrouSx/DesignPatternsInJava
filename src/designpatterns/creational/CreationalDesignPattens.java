package designpatterns.creational;

import designpatterns.creational.builder.BuilderDemo;
import designpatterns.creational.singleton.SingletonDemo;

public class CreationalDesignPattens {

	public static void main(String args[]) {
		System.out.println("Application started...");
		
		System.out.println("-----");
		SingletonDemo.run();
		System.out.println("-----");
		BuilderDemo.run();
		System.out.println("-----");
		
		System.out.println("Application finished...");
	}
}