package model.db;

public class DBInfo {

	private static String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
	private static String username ="collage";
	private static String password ="collage";
	
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
