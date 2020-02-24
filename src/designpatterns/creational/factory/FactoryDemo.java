package designpatterns.creational.factory;

import java.util.Calendar;

public class FactoryDemo {

	public static void run() {
		runFactoryCalendarExample();
		runWebpageFactoryExample();
	}
	
	private static void runFactoryCalendarExample() {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}
	
	private static void runWebpageFactoryExample() {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(site.getPages());
		
		Website anotherSite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(anotherSite.getPages());
	}
}
