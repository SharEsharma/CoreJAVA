package New_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start id");
		int stno=sc.nextInt();
		System.out.println("Enter the End id");
		int eno=sc.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/emp","root","root");
			Statement stmt= conn.createStatement();
			String qry= "select * from employee where e_id>="+stno+ " and e_id<="+eno;
			
			ResultSet rs= stmt.executeQuery(qry);
			boolean flag= false;
			while(rs.next()){
				flag=true;
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			if(flag=false){
				System.out.println("Record not found");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
