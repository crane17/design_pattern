package com.bird.bridge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand {

	@Override
	public void sale() {
		System.out.println("sell Lenovo computer!");
	}
	
}

class Dell implements Brand {

	@Override
	public void sale() {
		System.out.println("Sell Dell computer");
	}
	
}

class Apple implements Brand {

	@Override
	public void sale() {
		System.out.println("Sell Apple computer");
	}
	
}