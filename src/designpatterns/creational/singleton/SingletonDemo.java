package designpatterns.creational.singleton;

public class SingletonDemo {

	private SingletonDemo() {}
	
	public static void run() {
		runSingletonRuntimeExample();
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
}
