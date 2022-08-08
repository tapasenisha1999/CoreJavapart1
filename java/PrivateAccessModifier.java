package com.java;

class A {
	private int data = 40;

	void msg() {
		System.out.println("Hello java");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

public class PrivateAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		System.out.println(obj.getData());
		obj.msg();
	}

}
