package com.java;



public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myarray[][] = new int[3][];
		 
	       // define and initialize jagged array
	 
	       myarray[0] = new int[]{1,2,3};
	       myarray[1] = new int[]{4,5};
	       myarray[2] = new int[]{6,7,8,9,10};
	 
	       // display the jagged array
	       System.out.println("Two dimensional Jagged Array:");
	       for (int i=0; myarray.length; i++)
	    
	       {
	          for (int j=0; myarray[i].length; j++)
	              System.out.print(myarray[i][j] + " ");
	          System.out.println();

	}

}
}