package com.java;

import java.util.Calendar;

public class TimeMillies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long startTime = System.currentTimeMillis();  
//        StringBuffer sbuffer = new StringBuffer("Hello");  
//        for (int i=0; i<1000; i++){  
//            sbuffer.append("Java");  
//        }  
//        System.out.println("Time consumed by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
//startTime = System.currentTimeMillis();  
//        StringBuilder sbuilder = new StringBuilder("Hello");
//        for (int i=0; i<1000; i++){  
//            sbuilder.append("Python");  
//        }  
//        System.out.println("Time consumed by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
//
//	}
//
//}
		System.gc();
        StringBuilder stringBuilder = new StringBuilder("Tapase");
        long startTime1 = Calendar.getInstance().getTimeInMillis();
        for (long i = 0; i < 10000000; i++) {
            stringBuilder.append(i);
        }
        long endTime1 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Time taken for 10000000 appends for StringBuilder:" + (endTime1 - startTime1) + " ms");

        System.gc();
        StringBuffer stringBuffer = new StringBuffer("Vikram");
        long startTime2 = Calendar.getInstance().getTimeInMillis();
        for (long i = 0; i < 10000000; i++) {
            stringBuffer.append(i);
        }
        long endTime2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Time taken for 10000000 appends for StringBuffer:" + (endTime2 - startTime2) + " ms");

    }
}
