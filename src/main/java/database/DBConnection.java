package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	public static Connection dbConn() throws SQLException
	{
		
		Connection conn = null;
		try {
			//1. Load the driver
			// this Driver class knows how to communicate with the DB
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn_academy", "root", "");
			
			System.out.println("DB conected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	
		return conn;

}
}