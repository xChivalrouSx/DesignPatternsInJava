package designpatterns.creational;

import designpatterns.creational.abstractfactory.AbstractFactoryDemo;
import designpatterns.creational.builder.BuilderDemo;
import designpatterns.creational.factory.FactoryDemo;
import designpatterns.creational.prototype.PrototypeDemo;
import designpatterns.creational.singleton.SingletonDemo;

public class CreationalDesignPatterns {

	public static void runCreationalDesignPatterns() {
		System.out.println("-----");
		SingletonDemo.run();
		System.out.println("-----");
		BuilderDemo.run();
		System.out.println("-----");
		PrototypeDemo.run();
		System.out.println("-----");
		FactoryDemo.run();
		System.out.println("-----");
		AbstractFactoryDemo.run();
		System.out.println("-----");
	}
}