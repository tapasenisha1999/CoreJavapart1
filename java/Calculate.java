package com.java;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
	case 1:
        add = m + n;
        System.out.println("Result:"+add);
        break;

        case 2:
        sub = m - n;
        System.out.println("Result:"+sub);
        break;

        case 3:
        mul = m * n;
        System.out.println("Result:"+mul);
        break;

        case 4:
        div = (double)m / n;
        System.out.println("Result:"+div);
        break;    

        case 5:
        System.exit(0);
	}
}}

}
