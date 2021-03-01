package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.Window;

public class Newupdate {
	private int n;
	private PreparedStatement stat = null;
	private ResultSet a = null;
	private String sql = "UPDATE student SET sname=?,ssex=?,sage=?,setnic=?,syear=?,dno=?,sid=?,clno=?,"
			+ "sduration=? WHERE sno = TRIM(?)";
	private Connection conn = Loginutils.conn;
	public boolean isInsert = false;
	public String sno = Window.snoo;
	public Newupdate(String sname,String ssex,String sage,String setnic,String syear,
			String dno,String sid,String clno,String sduration) {
		try {
			stat = conn.prepareStatement(sql);
			stat.setString(1, sname);
			stat.setString(2, ssex);
			stat.setString(3, sage);
			stat.setString(4, setnic);
			stat.setString(5, syear);
			stat.setString(6, dno);
			stat.setString(7, sid);
			stat.setString(8, clno);
			stat.setString(9, sduration);
			stat.setString(10, sno);
			n = stat.executeUpdate();
			if(n>0) {
				isInsert = true;
			}}catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			}
		}
	
	public boolean isInsert() {
		return isInsert;
	}
	
}
