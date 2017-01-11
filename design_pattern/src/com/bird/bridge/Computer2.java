package com.bird.bridge;

public class Computer2 {
	protected Brand brand;
	public Computer2(Brand brand) {
		this.brand = brand;
	}
	public void sale() {
		brand.sale();
	}
}

class Desktop2 extends Computer2 {

	public Desktop2(Brand brand) {
		super(brand);
	}
	public void sale() {
		super.sale();
		System.out.println("sele Desktop2");
	}
}
class Laptop2 extends Computer2 {

	public Laptop2(Brand brand) {
		super(brand);
	}
	public void sale() {
		super.sale();
		System.out.println("sale laptop2");
	}
	
}
