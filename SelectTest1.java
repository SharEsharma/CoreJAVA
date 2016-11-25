package New_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class SelectTest1 {
public static void main(String[] args)throws ClassNotFoundException , Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/emp","root","root");
	java.sql.Statement stmt= conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from employee");
	while(rs.next()){
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	rs.close();
	stmt.close();
	
	
}
}
