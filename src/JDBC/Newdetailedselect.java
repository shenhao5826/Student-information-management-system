package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Newdetailedselect {
	private PreparedStatement stat = null;
	private ResultSet a = null;
	private String sql = "SELECT student.sno, student.sname, student.ssex, student.sage, student.setnic, "
			+ "student.syear, student.sid, student.sduration, class.clname, department.dname, college.coname "
			+ "FROM student INNER JOIN class ON student.clno = class.clno INNER JOIN department ON class.dn"
			+ "o = department.dno AND student.dno = department.dno	INNER JOIN college ON department.cono ="
			+ " college.cono WHERE student.sno =TRIM(?)";
	private Connection conn = Loginutils.conn;
	private String sno;
	private String sname;
	private String ssex;
	private String sage;
	private String setnic;
	private String syear;
	private String sid;
	private String sduration;
	private String dname;
	private String coname;
	private String clname;
	
	public Newdetailedselect(String condition) {
		try {
			stat = conn.prepareStatement(sql);
			stat.setString(1, condition);
			a = stat.executeQuery();
			while(a.next()) {
				this.sno = a.getString("sno");
				this.sname = a.getString("sname");
				this.ssex = a.getString("ssex");
				this.sage = a.getString("sage");
				this.setnic = a.getString("setnic");
				this.syear = a.getString("syear");
				this.sid = 	a.getString("sid");
				this.sduration = a.getString("sduration");
				this.dname = a.getString("dname");
				this.coname = a.getString("coname");
				this.clname = a.getString("clname");
			}}catch (SQLException e) {
			// TODO 自动生成的方法存根
			e.printStackTrace();
			}
	}

	public String getSno() {
		return sno;
	}

	public String getSname() {
		return sname;
	}

	public String getSsex() {
		return ssex;
	}

	public String getSage() {
		return sage;
	}

	public String getSetnic() {
		return setnic;
	}

	public String getSyear() {
		return syear;
	}

	public String getSid() {
		return sid;
	}

	public String getSduration() {
		return sduration;
	}

	public String getDname() {
		return dname;
	}

	public String getConame() {
		return coname;
	}

	public String getClname() {
		return clname;
	}
	
	
		
}
