package com.designpattern;

abstract class Girl {
	String description = "no particular";

	public String getDescription() {
		return description;
	}
}

class AmericanGirl extends Girl {
	public AmericanGirl() {
		description = "American Girl";
	}
}

class EuropeanGirl extends Girl {
	public EuropeanGirl() {
		description = "European Girl";
	}
}

abstract class GirlDecorator extends Girl {
	public abstract String getDescription();
}

class Science extends GirlDecorator {

	private Girl girl;

	public Science(Girl g) {
		girl = g;
	}

	@Override
	public String getDescription() {
		return girl.getDescription() + "=Like Science";
	}

	public void caltulateStuff() {
		System.out.println("scientific calculation!");
	}
}

class Art extends GirlDecorator {

	private Girl girl;

	public Art(Girl g) {
		girl = g;
	}

	@Override
	public String getDescription() {
		return girl.getDescription() + "+Like Art";
	}

	public void draw() {
		System.out.println("draw pictures!");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl g1 = new EuropeanGirl();
		System.out.println(g1.getDescription());

		Science g2 = new Science(g1);
		System.out.println(g2.getDescription());

		Art g3 = new Art(g2);
		System.out.println(g3.getDescription());

	}

}
