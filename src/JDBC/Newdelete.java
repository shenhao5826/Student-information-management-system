package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Newdelete {
	private int n;
	private PreparedStatement stat = null;
	private ResultSet a = null;
	private String sql = "DELETE FROM student WHERE sno = TRIM(?)";
	private Connection conn = Loginutils.conn;
	public boolean isdelete = false;
	
	public Newdelete(String snoo) {
		try {
			stat = conn.prepareStatement(sql);
			stat.setString(1, snoo);
			n = stat.executeUpdate();
			if(n>0) {
				isdelete = true;
			}}catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			}
		}
	
	public boolean isdelete() {
		return isdelete;
	}
	
}
