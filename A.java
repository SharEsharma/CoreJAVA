//Example.1
package New_JDBC;
//Shubham
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class A {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/emp","root","root");
			java.sql.Statement stmt= conn.createStatement();
			stmt.execute("create table tab14(id int,name varchar(10))");
			System.out.println("done");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
