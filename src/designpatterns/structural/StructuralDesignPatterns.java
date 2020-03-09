package designpatterns.structural;

import java.sql.SQLException;

import designpatterns.structural.adapter.AdapterDemo;
import designpatterns.structural.bridge.BridgeDemo;

public class StructuralDesignPatterns {

	public static void runStructuralDesignPatterns() throws SQLException {
		System.out.println("-----");
		AdapterDemo.run();
		System.out.println("-----");
		BridgeDemo.run();
		System.out.println("-----");
	}
}
