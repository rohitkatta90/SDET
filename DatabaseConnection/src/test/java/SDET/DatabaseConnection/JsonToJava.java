package SDET.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JsonToJava {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/business","root","Root12345");
			Statement st=conn.createStatement();
			ResultSet result=st.executeQuery("select * from CustomerInfo;");
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
				

			}
		
	}

}
