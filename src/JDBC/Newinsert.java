package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Newinsert {
	private int n;
	private PreparedStatement stat = null;
	private ResultSet a = null;
	private String sql = "INSERT INTO student(sno,sname,ssex,sage,setnic,syear,dno,sid,clno,sduration) "
			+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
	private Connection conn = Loginutils.conn;
	public boolean isInsert = false;
	
	public Newinsert(String sno,String sname,String ssex,String sage,String setnic,String syear,
			String dno,String sid,String clno,String sduration) {
		try {
			stat = conn.prepareStatement(sql);
			stat.setString(1, sno);
			stat.setString(2, sname);
			stat.setString(3, ssex);
			stat.setString(4, sage);
			stat.setString(5, setnic);
			stat.setString(6, syear);
			stat.setString(7, dno);
			stat.setString(8, sid);
			stat.setString(9, clno);
			stat.setString(10, sduration);
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