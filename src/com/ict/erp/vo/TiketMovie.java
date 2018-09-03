package com.ict.erp.vo;

public class TiketMovie {
	
	private long tmNum;
	private String tmName;
	private long tmPrice;
	private long tmStartDat;
	private long tmEndDat;
	private String tmCredat;
	private String tmDesc;
	private long tmCnt;
	private String tmImg;
	
	public TiketMovie() {}
	
	public TiketMovie(long tmNum, String tmName, long tmPrice, long tmStartDat, long tmEndDat, String tmCredat,
			String tmDesc, long tmCnt, String tmImg) {
		super();
		this.tmNum = tmNum;
		this.tmName = tmName;
		this.tmPrice = tmPrice;
		this.tmStartDat = tmStartDat;
		this.tmEndDat = tmEndDat;
		this.tmCredat = tmCredat;
		this.tmDesc = tmDesc;
		this.tmCnt = tmCnt;
		this.tmImg = tmImg;
	}

	public long getTmNum() {
		return tmNum;
	}

	public void setTmNum(long tmNum) {
		this.tmNum = tmNum;
	}

	public String getTmName() {
		return tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
	}

	public long getTmPrice() {
		return tmPrice;
	}

	public void setTmPrice(long tmPrice) {
		this.tmPrice = tmPrice;
	}

	public long getTmStartDat() {
		return tmStartDat;
	}

	public void setTmStartDat(long tmStartDat) {
		this.tmStartDat = tmStartDat;
	}

	public long getTmEndDat() {
		return tmEndDat;
	}

	public void setTmEndDat(long tmEndDat) {
		this.tmEndDat = tmEndDat;
	}

	public String getTmCredat() {
		return tmCredat;
	}

	public void setTmCredat(String tmCredat) {
		this.tmCredat = tmCredat;
	}

	public String getTmDesc() {
		return tmDesc;
	}

	public void setTmDesc(String tmDesc) {
		this.tmDesc = tmDesc;
	}

	public long getTmCnt() {
		return tmCnt;
	}

	public void setTmCnt(long tmCnt) {
		this.tmCnt = tmCnt;
	}

	public String getTmImg() {
		return tmImg;
	}

	public void setTmImg(String tmImg) {
		this.tmImg = tmImg;
	}

	@Override
	public String toString() {
		return "TiketMovie [tmNum=" + tmNum + ", tmName=" + tmName + ", tmPrice=" + tmPrice + ", tmStartDat="
				+ tmStartDat + ", tmEndDat=" + tmEndDat + ", tmCredat=" + tmCredat + ", tmDesc=" + tmDesc + ", tmCnt="
				+ tmCnt + ", tmImg=" + tmImg + "]";
	}

}
