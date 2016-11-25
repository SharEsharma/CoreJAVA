//Example.5
// select data from data base
package New_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class E {
	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from tab14");
		System.out.println("Select command work");
		while(rs.next()){
			System.out.print(rs.getInt(1));
			System.out.println("\t"+rs.getString(2));
		}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
