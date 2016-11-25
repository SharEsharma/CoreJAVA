//Example 6
package New_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;

public class F {
	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/emp","root","root");
		Statement stmt= conn.createStatement();
		System.out.println("working");
		DatabaseMetaData dbmd= conn.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
