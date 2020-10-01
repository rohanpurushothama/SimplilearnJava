package string_demo;

public class stringdemo {

	public static void main(String[] args) {
		String s1 ="hello";
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		String s2="hello";
		String s3= new String("hello");
		// s3 = s3.intern(); brings to the common pool
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equalsIgnoreCase("HELLO"));
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(0));
		
		for (int i=0; i<s1.length(); i++) {
			System.out.println(i+ " -> " +s1.charAt(i));
		}
		
		System.out.println(s1.substring(1)); //minus that starts from 1
		System.out.println(s1.substring(1, 3)); //gives between 
		
		String s4 = "hi hello what is up do you want to ccome in";
		String s5[] = s4.split(" ");
		for (int i=0; i <s5.length; i++) {
			System.out.println(s5[i]);
		}
		
		
		char c[]=s4.toCharArray();
		for (char x:c) {
			System.out.println(x);
		}
	}
}
