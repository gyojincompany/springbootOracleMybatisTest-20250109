package com.jbedu.member.dto;

import java.sql.Timestamp;

public class MemberDto {
	
	private String mid;
	private String mpw;
	private String mname;
	private String memail;
	private int mage;
	private Timestamp mdate;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String mid, String mpw, String mname, String memail, int mage, Timestamp mdate) {
		super();
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.memail = memail;
		this.mage = mage;
		this.mdate = mdate;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public int getMage() {
		return mage;
	}

	public void setMage(int mage) {
		this.mage = mage;
	}

	public Timestamp getMdate() {
		return mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}
	
	
	

}
