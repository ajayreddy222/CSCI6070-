package db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	
	static Connection conn = null;

	public static void createConnection() throws ClassNotFoundException {
        try {        	 
			
        	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	 String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=IMDB";
        	 String user = "sa";
			 String pass = "root";
			 
            /*
    		Class.forName("com.mysql.jdbc.Driver");
    		String dbURL = "jdbc:mysql://localhost:3306/javaproject";
    		String user  = "root";
    		String pass = "tiger";
    		*/
            
            conn = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
	}
	
	public static ResultSet getQueryResult(String query) throws SQLException {
		try {
			createConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Statement stmt = conn.createStatement( );
		ResultSet rs = stmt.executeQuery(query);
		return rs;
	}
	
	public static ResultSet getQueryResult1(String query) throws SQLException {
		try {
			createConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		CallableStatement stmt = conn.prepareCall(query);
		ResultSet rs = stmt.executeQuery();
		return rs;
	}
	
	public static void closeConnection(){
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}
	
}
