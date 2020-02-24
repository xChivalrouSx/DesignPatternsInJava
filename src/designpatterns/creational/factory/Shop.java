package designpatterns.creational.factory;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new HomePage());
	}

}
