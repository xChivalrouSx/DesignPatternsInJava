package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item)(items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems() {
		MovieItem movieItem = new MovieItem();
		movieItem.setTitle("Test Movie");
		movieItem.setPrice(15.90);
		movieItem.setRuntime("2 Hours");
		items.put("Movie", movieItem);
		
		BookItem bookItem = new BookItem();
		bookItem.setTitle("Test Book");
		bookItem.setPrice(10.50);
		bookItem.setNumberOfPage(167);
		items.put("Book", bookItem);
	}
}
