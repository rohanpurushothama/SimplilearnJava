package myPack;

public class AMain {

	public static void main(String[] args) {
		
		A.helloStatic();
		
		A obj= new A();
		obj.helloPublic();
		obj.helloDefault();
		obj.helloProtected();
		obj.accessPrivate();
	}
}
