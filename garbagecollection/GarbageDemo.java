package com.garbagecollection;

public class GarbageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GarbageDemo gd=new GarbageDemo();
	gd=null;
		String string = new String("Hello");
		string = null;
		System.gc();
		System.out.println("\tMain method");
		

	}
	protected void finalize() {
		System.out.println("\tOverriding now.");
		
	}

}
