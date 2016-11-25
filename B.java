package New_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class B {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/emp","root","root");
			                                             
			java.sql.Statement stmt=conn.createStatement();
			stmt.execute("insert into tab14 values(12,'shubham')");
			System.out.println("Record successfull inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
