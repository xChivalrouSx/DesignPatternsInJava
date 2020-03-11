package designpatterns.structural.bridge;

public class Red implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying red color...");
	}

}
