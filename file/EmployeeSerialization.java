package com.java1.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\abc.txt");
		ObjectOutputStream obj =new ObjectOutputStream(fos);
//		Employee e =new Employee();
//		e.id =1;
//		e.name="Nisha";
//		e.city="Mumbai";
//	    obj.writeObject(e);
//	    System.out.println("Data is saved");
//		
		Employee e1 =new Employee();
		e1.setId(102);
		e1.setName("Nisha");
		e1.setCity("Mumbai");
		
		Employee e2 =new Employee();
		e2.setId(103);
		e2.setName("Rina");
		e2.setCity("Pune");
		
		Employee e3 =new Employee();
		e3.setId(102);
		e3.setName("Trupti");
		e3.setCity("Karnatka");
		
		obj.writeObject(e1);
		obj.writeObject(e2);
		obj.writeObject(e3);
		
		System.out.println("All employee data is saved");
		
	}

}
