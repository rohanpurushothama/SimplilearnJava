package regex_demo;

public class OldStyle {

	public static void main(String[] args) {
		String s=  "sfgkZZ ,, *87=91. iohsfafooubJJBasobJJJ AAs";
		int alpha = 0, upper = 0, lower = 0, digits = 0, alphanum = 0;
		
		for (int i = 0; i <s.length(); i++) {
			char c=s.charAt(i);
			
			System.out.println(c);
		
		if(Character.isAlphabetic(c)) {
			alpha++;
		}
		if(Character.isUpperCase(c)) {
			upper++;
		}
		if(Character.isLowerCase(c)) {
			lower++;
					}
		if(Character.isDigit(c)) {
			digits++;
		}
		if(Character.isLetterOrDigit(c)) {
			alphanum++;
		}
			
		
		
		}
		
		
		
	}
}
