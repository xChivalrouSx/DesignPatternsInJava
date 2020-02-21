package designpatterns.creational.builder;

public class BuilderDemo {

	private BuilderDemo() {}
	
	public static void run() {
		runStringBuilderExample();
	}
	
	private static void runStringBuilderExample() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("This is a test message ");
		builder.append("which created with stringbuilder. ");
		builder.append("Hello Design Patterns... Number: ");
		builder.append(0);
		
		System.out.println(builder.toString());
	}
}
