package New_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	static Connection conn;
	public static Connection getconnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
		try{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return conn;
	}
	public static void closeConnection(){
		try{
			conn.close();
		}
		catch(SQLException e){
			System.out.println(e);
		}
	}

}
