package DEMO;

class Emp extends Person {
	float salary;
	Emp(String name, float salary){
		super(name);
		this.salary=salary;
	}
	
	void display() {
		System.out.println(name + " " + salary);
	}
	
}
