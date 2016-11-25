package New_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Nocode {
	public static void main(String[] args) throws SQLException {
		Connection conn=Util.getconnection();
		PreparedStatement ps= conn.prepareStatement("insert into tab14 values(?,?)");
		ps.setInt(1, 101);
		ps.setString(2, "raju");
		ps.executeUpdate();
		ps.setInt(1, 102);
		ps.setString(2, "ram");
		ps.executeUpdate();
		ps.setInt(1, 103);
		ps.setString(2, "madan");
		ps.executeUpdate();
		ps.setInt(1, 104);
		ps.setString(2, "shubham");
		ps.executeUpdate();
		ps.setInt(1, 105);
		ps.setString(2, "teena");
		
		ps.executeUpdate();
		System.out.println("done");
		
	}

}
