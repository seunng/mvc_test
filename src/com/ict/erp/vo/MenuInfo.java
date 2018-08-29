package com.ict.erp.vo;

public class MenuInfo {
	
	private long meiNum;
	private String meiName;
	private long meiPrice;
	private String meiDesc;
	public MenuInfo() {}
	
	public MenuInfo(long meiNum, String meiName, long meiPrice, String meiDesc) {
		super();
		this.meiNum = meiNum;
		this.meiName = meiName;
		this.meiPrice = meiPrice;
		this.meiDesc = meiDesc;
	}
	public long getMeiNum() {
		return meiNum;
	}
	public void setMeiNum(long meiNum) {
		this.meiNum = meiNum;
	}
	public String getMeiName() {
		return meiName;
	}
	public void setMeiName(String meiName) {
		this.meiName = meiName;
	}
	public long getMeiPrice() {
		return meiPrice;
	}
	public void setMeiPrice(long meiPrice) {
		this.meiPrice = meiPrice;
	}
	public String getMeiDesc() {
		return meiDesc;
	}
	public void setMeiDesc(String meiDesc) {
		this.meiDesc = meiDesc;
	}
	@Override
	public String toString() {
		return "menuInfo [meiNum=" + meiNum + ", meiName=" + meiName + ", meiPrice=" + meiPrice + ", meiDesc=" + meiDesc
				+ "]";
	}
	
	

}
