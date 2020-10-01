package regex_demo;

public class RegExDemo {
	public static void main(String[] args) {
		
		//Reg-Ex - Regular Expression
		//Works based on Pattern Matching
		/*
		 *Reg-Ex 
		 *[] - refers to expression/pattern
		 *{} - length
		 *^ - not
		 *[a-z]{5} - any 5 lowercase letters
		 *[A-Za-Z]{10} - any words of   characters
		 *[0-9]{2} - any 2 digits
		 *[a-z0-9]{3,6} - any lowercase alpha numeric value between length 3 &6
		 *[0-9]{1,} minimum 1 digit
		 * 
		 */
		
		String s=  "sfgkZZ ,, *87=91. iohsfafooubJJBasobJJJ AAs";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		
	}
}
