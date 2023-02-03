package com.spring.reference;

public class A {
	int X;
	B objB;
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public B getObjB() {
		return objB;
	}
	public void setObjB(B objB) {
		this.objB = objB;
	}
	@Override
	public String toString() {
		return "A [X=" + X + ", objB=" + objB + "]";
	}




}
