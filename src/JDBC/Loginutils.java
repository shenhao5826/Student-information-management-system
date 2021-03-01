package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Loginutils {
	
	public static Connection conn = null;
	public static String user = null;
	private String pass = null;
	private String ip = null;
	private boolean islogin;
	
	public Connection getLogin(String ip,String user,String pass) {
		
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			this.user = user;
			this.pass = pass;
			this.ip = ip;
			String url = "jdbc:mysql://"+this.ip+"/school?"
					+ "useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
			
			conn = DriverManager.getConnection(url,user,pass);
			
			islogin = true;
			}
		catch(Exception e) {
			islogin = false;
			}
		return conn;
	}
	

    public boolean getislogin() {
		return islogin;
	}
	
}
