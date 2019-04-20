package DatabaseOracle;

import java.sql.*;

public class Database {

	public static void main(String[] args) {
		
		 String databaseURL = "jdbc:mysql://localhost:3306/airline?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC" ;
		 String databaseUsername = "root";
		 String databasePassword = "1234abcd";
		
		try {
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection(databaseURL,databaseUsername, databasePassword );
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute a SQL query
			//ResultSet myRs = myStmt.executeQuery(" select * from login ");
			
			//4. Process the result set
			
			
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
