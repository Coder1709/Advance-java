package com.niet;

public class Student {
	private int sId;
	private String sName;
	private String sAddress;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

}
