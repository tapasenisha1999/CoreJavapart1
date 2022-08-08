package com.garbagecollection;

public class FinalizeNotGuranteed implements Runnable{
	private void getMyMethod() throws InterruptedException {
		try {
			System.out.println("Hi, I am TRY");
			throw new NullPointerException();
			
		}catch (NullPointerException e) {
			System.out.println("Hi, I am FINALLY");
			
		}
		
	}
	
	protected void finalize() throws Throwable {
		System.out.println("I am inside finalize block");
		super.finalize();
		
		
	}
	
	public void run() {
		try {
			getMyMethod();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=3; i++) {
			new Thread(new FinalizeNotGuranteed()).start();	
		}

	}

}
