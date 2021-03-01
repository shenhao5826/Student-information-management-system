package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Newselect {
	private PreparedStatement stat = null;
	private ResultSet a = null;
	private ObservableList<HashMap<String, SimpleStringProperty>> list = FXCollections.observableArrayList();
	private String sql = "SELECT student.sno, student.sname, student.ssex, student.sage, "
			+ "class.clname FROM student INNER JOIN class ON student.clno = class.clno "
			+ "WHERE student.sno =TRIM(?) OR student.sname =TRIM(?) ";
	private Connection conn = Loginutils.conn;
	private boolean isinformation = false;
	
	public Newselect(String condition) {
		try {
			stat = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stat.setString(1, condition);
			stat.setString(2, condition);
			a = stat.executeQuery();
			
			if(a.next()) {
				isinformation = true;
			}
			
			}catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			}
		}
	
	public ObservableList<HashMap<String, SimpleStringProperty>> out() {
		try {
			a.previous();
			while(a.next()) {
					HashMap<String, SimpleStringProperty> map=new HashMap<String,SimpleStringProperty>();
					map.put("sno", new SimpleStringProperty(a.getString("sno")));
					map.put("sname", new SimpleStringProperty(a.getString("sname")));
					map.put("ssex", new SimpleStringProperty(a.getString("ssex")));
					map.put("sage", new SimpleStringProperty(a.getString("sage")));
					map.put("clname", new SimpleStringProperty(a.getString("clname")));
					
					list.add(map);
				}
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		return list;
		
	}

	public boolean getisinformation() {
		return isinformation;
		
	}
	
	
	
}
	

