package designpatterns.creational.factory;

import java.util.Calendar;

public class FactoryDemo {

	public static void run() {
		runFactoryCalendarExample();
	}
	
	private static void runFactoryCalendarExample() {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}
	
}
