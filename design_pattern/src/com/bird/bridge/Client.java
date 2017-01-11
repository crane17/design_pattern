package com.bird.bridge;

public class Client {
	public static void main(String[] args) {
		Computer2 computer2 = new Laptop2(new Lenovo());
		computer2.sale();
		
		Computer2 c = new Desktop2(new Apple());
		c.sale();
	}
}
