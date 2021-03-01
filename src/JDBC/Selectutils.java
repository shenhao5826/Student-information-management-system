package JDBC;

public class Selectutils {

	private String sno;
	private String sname;
	private String ssex;
	private String sage;
	private String setnic;
	private String syear;
	private String dno;
	private String sid;
	private String clno;
	private String sduration;

	public Selectutils(String sno, String sname, String ssex, String sage, String setnic, String syear, String dno, String sid,
			String clno, String sduration) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.setnic = setnic;
		this.syear = syear;
		this.dno = dno;
		this.sid = sid;
		this.clno = clno;
		this.sduration = sduration;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSage() {
		return sage;
	}

	public void setSage(String sage) {
		this.sage = sage;
	}

	public String getSetnic() {
		return setnic;
	}

	public void setSetnic(String setnic) {
		this.setnic = setnic;
	}

	public String getSyear() {
		return syear;
	}

	public void setSyear(String syear) {
		this.syear = syear;
	}

	public String getDno() {
		return dno;
	}

	public void setDno(String dno) {
		this.dno = dno;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getClno() {
		return clno;
	}

	public void setClno(String clno) {
		this.clno = clno;
	}

	public String getSduration() {
		return sduration;
	}

	public void setSduration(String sduration) {
		this.sduration = sduration;
	}
	
}
