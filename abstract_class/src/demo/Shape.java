package demo;

public abstract class Shape {
	abstract void draw();
	
}

class triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle");
	}
}

class rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
} 