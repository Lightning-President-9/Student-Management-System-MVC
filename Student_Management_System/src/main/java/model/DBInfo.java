package model;

public class DBInfo {

	private static String dbUrl =System.getenv().get("dbUrl");
	private static String username =System.getenv().get("username");
	private static String password =System.getenv().get("password");
	
	public static String getDbUrl() {
		return dbUrl;
	}
	public static String getUsername() {
		return username;
	}
	public static String getPassword() {
		return password;
	}
}
