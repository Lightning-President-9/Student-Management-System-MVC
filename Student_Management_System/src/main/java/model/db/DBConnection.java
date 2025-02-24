package model.db;
import java.sql.*;
public class DBConnection{
	private static Connection con = null;
	private DBConnection(){}
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(DBInfo.getDbUrl(),DBInfo.getUsername(),DBInfo.getPassword());
		}catch(Exception e){e.printStackTrace();}
	}
	
	public static Connection getCon(){
		return con;
	}
}