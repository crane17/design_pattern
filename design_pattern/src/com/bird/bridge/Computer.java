package com.bird.bridge;

public interface Computer {
	void sale();
}

class Desktop implements Computer {

	@Override
	public void sale() {
		System.out.println("sell desktop computer");
	}
	
}

class Laptop implements Computer {

	@Override
	public void sale() {
		System.out.println("sell laptop computer");
	}
	
}

class Pad implements Computer {

	@Override
	public void sale() {
		System.out.println("sell Pad computer");
	}
	
}

class LenovoDesktop extends Desktop {
	public void sale() {
		System.out.println("sell lenovo Desktop");
	}
}

class LenovoLaptop extends Laptop {
	public void sale() {
		System.out.println("sell lenovo Laptop!");
	}
}

class LenovoPad extends Pad {
	public void sale() {
		System.out.println("sell lenovo Pad");
	}
}
class DellDesktop extends Desktop {
	public void sale() {
		System.out.println("sale dell desktop");
	}
}
class DellLaptop extends Laptop {
	public void sale() {
		System.out.println("sale dell laptop");
	}
}
class DellPad extends Pad {
	public void sale() {
		System.out.println("sale dell pad");
	}
}
class AppleDesktop extends Desktop {
	public void sale() {
		System.out.println("sale Apple Desktop");
	}
}
class AppleLaptop extends Laptop {
	public void sale() {
		System.out.println("sale Apple Laptop");
	}
}
class ApplePad extends Pad {
	public void sale() {
		System.out.println("sale Apple Pad");
	}
}