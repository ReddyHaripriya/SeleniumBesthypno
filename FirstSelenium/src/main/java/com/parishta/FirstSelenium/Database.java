package com.parishta.FirstSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

public Connection dataBaseConnection() throws SQLException, ClassNotFoundException{
		       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		       System.out.println("driverloaded");
		       String server="besthypno.db.2010104.hostedresource.com";
		      // int port=1433;
		       String user="besthypno" ;
		       String psw="Parishta21@";
		       String database="besthypno";
		      

		       //String userName = "sa";
		      // String password = "password";
		      String url = "jdbc:sqlserver://"+server+";user="+user+";password="+psw+";databaseName="+database;
		      Connection con = DriverManager.getConnection(url);
		      return con;
}

public void activateGivenUser(String userId) throws SQLException, ClassNotFoundException{
	
		     Connection con=dataBaseConnection();
		      String sql="UPDATE ClientDetails SET IsActive=1 WHERE UserId='"+userId + "'";
		       
		      PreparedStatement ps=con.prepareStatement(sql);
		      
		         ps.executeUpdate();
		       
		           con.close();
		      

}

public void deleteUser(String userId) throws ClassNotFoundException, SQLException{
	Connection con=dataBaseConnection();
    String sql="DELETE From ClientDetails WHERE UserId='"+userId + "'";
     
    PreparedStatement ps=con.prepareStatement(sql);
    
       ps.executeUpdate();
     
         con.close();
}
	   }

		   