package designpatterns.creational.factory;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new HomePage());
		pages.add(new AboutPage());
	}

}
