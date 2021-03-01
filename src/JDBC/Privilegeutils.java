package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Privilegeutils {
	
	private PreparedStatement stat = null;
	private ResultSet a = null;
	private String sql = "SHOW GRANTS for ?@'%'";
	private String aa = Loginutils.user;
	private String aaa = null;
	private Connection conn = Loginutils.conn;
	private boolean isadmin;
	private String user = Loginutils.user;
	
	//返回用户权限语句
	public String getPrivilege() {
		try {
			
			stat = conn.prepareStatement(sql);
			stat.setString(1, aa);
			a = stat.executeQuery();
			while(a.next()) {
				aaa = a.getString(1);
			}
//			System.out.println(aaa);
			
			
		}catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			}
		return aaa;
		}
	
	//返回是否为管理员
	public void isadmin(){
		
		if(aaa.contains("root")) {
			isadmin = true;
		}else if(aaa.contains("ALL PRIVILEGES")) {
			isadmin = true;
			}else {
				isadmin = false;
				}
	}
	
	public boolean getisadmin() {
		return isadmin;
	}
	
}
