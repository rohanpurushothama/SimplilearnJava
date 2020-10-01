package myPack;

public class A {

	public void helloPublic() {
		System.out.println("Hello public from class A");
	}
	
	private void helloPrivate() {
		System.out.println("Hello from protected method in Class A");
	}
	
	protected void helloProtected() {
		System.out.println("Hello from protected method in Class A");
	}
	
	
	void helloDefault() {
		System.out.println("Hello from protected method in Class A");
	}
	
	public static void helloStatic() {
		System.out.println("Hello from protected method in Class A");
	}
	
	public void accessPrivate() {
		helloPrivate();
	}
}
