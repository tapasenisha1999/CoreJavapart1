package com.designpattern;

class Chevrolet implements Car {

	@Override
	public void build() {
		System.out.println("Chevrolet::This is car");

	}
}

class BMW implements Car {

	@Override
	public void build() {
		System.out.println("BMW::This is car");

	}

}

class Renault implements Car {

	@Override
	public void build() {
		System.out.println("Renault::This is car");

	}

}

class FacadeForCar {
	private Car Chevrolet;
	private Car BMW;
	private Car Renault;

	public FacadeForCar() {
		Chevrolet = new Chevrolet();
		BMW = new BMW();
		Renault = new Renault();

	}

	public void buildChevrolet() {
		Chevrolet.build();

	}

	public void buildBMW() {
		BMW.build();
	}

	public void buildRenault() {
		Renault.build();
	}

}

public class FacadePatternDemo {

	public static void main(String[] args) {
		FacadeForCar fc = new FacadeForCar();
		fc.buildChevrolet();
		fc.buildBMW();
		fc.buildRenault();

	}

}
