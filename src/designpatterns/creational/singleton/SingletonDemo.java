package designpatterns.creational.singleton;

public class SingletonDemo {

	private SingletonDemo() {}
	
	public static void run() {
		runSingletonRuntimeExample();
		runDbSingletonExample();
	}
	
	private static void runSingletonRuntimeExample() {
		Runtime singletonRuntime = Runtime.getRuntime();
		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime otherSingletonRuntime = Runtime.getRuntime();
		
		System.out.println(otherSingletonRuntime);
		
		if(singletonRuntime == otherSingletonRuntime) {
			System.out.println("They are the same instance.");
		}
	}
	
	private static void runDbSingletonExample() {
		DbSingleton dbSingleton = DbSingleton.getInstance();
		
		System.out.println(dbSingleton);
		
		DbSingleton anotherDbSingleton = DbSingleton.getInstance();
		
		System.out.println(anotherDbSingleton);
		
		if(dbSingleton == anotherDbSingleton) {
			System.out.println("They are the same instance.");
		}
	}
}
