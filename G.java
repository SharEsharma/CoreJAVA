package New_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class G {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			Statement stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tab14");
			ResultSetMetaData r= rs.getMetaData();
			System.out.println(r.getColumnCount());
			
			System.out.println(r.getCatalogName(1));
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
