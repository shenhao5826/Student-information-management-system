package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class selectsno {
	
	private String aaa;
	private PreparedStatement stat = null;
	private ResultSet a = null;
	private int aaaa;
	private String sql1 = " select sno from student order by sno DESC limit 1;";
	private Connection conn = Loginutils.conn;
	
	public selectsno() {
		
		Selectutils aa = null;
		
		try {
			
			//使用PreparableStatement防止SQL注入
			stat = conn.prepareStatement(sql1);
			a = stat.executeQuery();
			}catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			}
		}
	
	public int out() {
		try {
			a = stat.executeQuery();
			if(a.next()) {
					
					int sno = a.getInt("sno");
					aaaa = sno;

				}else {
					System.out.println("查询失败");
				}
			}
			catch(SQLException e){
				
				e.printStackTrace();
				
			}
		return aaaa;
	}
	
}
	

