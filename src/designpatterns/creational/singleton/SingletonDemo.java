package designpatterns.creational.singleton;

public class SingletonDemo {

	private SingletonDemo() {}
	
	public static void run() {
		runSingletonRuntimeExample();
		runDbSingletonExample();
	}
	
	private static void compareObjects(Object firstObject, Object secondObject) {
		if(firstObject == secondObject) {
			System.out.println("They are the same instance.");
		}
	}
	
	private static void runSingletonRuntimeExample() {
		Runtime singletonRuntime = Runtime.getRuntime();
		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime otherSingletonRuntime = Runtime.getRuntime();
		
		System.out.println(otherSingletonRuntime);
		
		compareObjects(singletonRuntime, otherSingletonRuntime);
	}
	
	private static void runDbSingletonExample() {
		DbSingleton dbSingleton = DbSingleton.getInstance();
		
		System.out.println(dbSingleton);
		
		DbSingleton anotherDbSingleton = DbSingleton.getInstance();
		
		System.out.println(anotherDbSingleton);
		
		compareObjects(dbSingleton, anotherDbSingleton);
	}
}
