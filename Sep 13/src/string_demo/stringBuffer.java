package string_demo;

public class stringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello"); //thread safe
		System.out.println(sb);
		sb.append(" heyy").append(" java");
		System.out.println(sb);
	
	sb.insert(1, "HIBERNATE");
	System.out.println(sb);
	
	System.out.println(sb.reverse());
	
	sb.deleteCharAt(1);
	System.out.println(sb);
	
	
	sb.delete(2, 5);
	System.out.println(sb);
	
	
	
	
	
	
	
	
	
	}
	
}
