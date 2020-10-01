package regex_demo;

public class PanCard {

	public static void main(String[] args) {
		//length 
		//5 uppercase
		//4 digits
		//upperscase at end
		
		String pan="ABCDE1234M";
				
		if(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("VALID PAN");
		}
		else {
			System.out.println("INVALID PAN");
		}
				
	}
}

//validate other id proofs
//passport no. dl. no. aadhar.