package project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class edit_file {

//ADDING NEW FILE	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner (System.in);
		boolean result;
	
		System.out.println("Enter file name to be created: ");
		 String filename = equalsIgnoreCase(ip.nextLine());
		
		File new_file = new File("C:\\Users\\rohan\\Desktop\\NEWCREATES\\"+filename+".txt");
		try
		{
			result = new_file.createNewFile();
			if(result) {
				System.out.println("File has been created: " +filename);
			}
			else {
				System.out.println("File already exists in the folder");
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
//DELETING THE FILE
		
		File delete_file = new File("C:\\Users\\rohan\\Desktop\\NEWCREATES\\"+filename+".txt");
		try
		{
			result = delete_file.createNewFile();
			if(result) {
				System.out.println("File has been created: " +filename);
			}
			else {
				System.out.println("File already exists in the folder");
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

//SEARCH THE FILE
	

	
	
private static String equalsIgnoreCase(String nextLine) {
	// TODO Auto-generated method stub
	return null;
}

}
