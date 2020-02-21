package designpatterns.creational.builder;

public class BuilderDemo {

	private BuilderDemo() {}
	
	public static void run() {
		runStringBuilderExample();
		runLunchOrderBuilderExample();
	}
	
	private static void runStringBuilderExample() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("This is a test message ");
		builder.append("which created with stringbuilder. ");
		builder.append("Hello Design Patterns... Number: ");
		builder.append(0);
		
		System.out.println(builder.toString());
	}
	
	private static void runLunchOrderBuilderExample() {
		LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();
		lunchOrderBuilder.bread("test-bread").condiments("test-condiments").dressing("test-dressing").meat("test-meat");
		
		LunchOrder lunchOrder = lunchOrderBuilder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	}
}
