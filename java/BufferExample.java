package com.java;

public class BufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();  
        System.out.println(sb.capacity());  
        sb.append("DataFlair");  
        System.out.println(sb.capacity());
        sb.append("DataFlair is company that teaches programming!!!");  
        System.out.println(sb.capacity()); 
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());  
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

	}

}
