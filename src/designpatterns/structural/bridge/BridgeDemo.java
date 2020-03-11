package designpatterns.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeDemo {

	private BridgeDemo() {}
	
	public static void run() throws SQLException {
		runJdbcExample();
		runShapeBridgeExample();
	}
	
	private static void runJdbcExample() throws SQLException {
		Connection connection = null;
		Statement statement = null;
		
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

			connection = DriverManager.getConnection(dbUrl);
			statement = connection.createStatement(); 
			
			statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
							+ " City VARCHAR(20))");
			
			System.out.println("Table created...");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				connection.close();
			}
			if(statement != null) {
				statement.close();
			}
		}
	}
	
	private static void runShapeBridgeExample() {
		Color blue = new Blue();
		Color red = new Red();
		
		Shape squareBlue = new Square(blue);
		Shape squareRed = new Square(red);
		Shape circleRed = new Circle(red);
		
		squareBlue.applyColor();
		squareRed.applyColor();
		circleRed.applyColor();
	}
	
	
}
