package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int option_ip = 0;
		int edit_ip = 0;
		int exit_ip = 0;
		edit_file ef= new edit_file();
		
		
		System.out.println("Welcome to Lockers Pvt. Ltd. File handling application \nBy - Rohan Purushothama");
		System.out.println("Please click on any key to continue");	
		
		try {
			System.in.read();
			
			do {
				System.out.println("OPTIONS");
				System.out.println("------------");
				System.out.println("1)File list");
				System.out.println("2)Edit");
				System.out.println("3)Exit");
				System.out.println("Please enter the option(1,2 or 3)");
				
				try {
					option_ip = Integer.parseInt(ip.nextLine());
					} 
				catch (NumberFormatException e) {
				}
			
				switch (option_ip) {
				case 1: 
					File 
					
				break;
				
				case 2: 
					System.out.println("Press 1 to ADD a file");
					System.out.println("Press 2 to DELETE a file");
					System.out.println("Press 3 to SEARCH a file");
//					try {
//						edit_ip = Integer.parseInt(ip.nextLine());
//					}
//					catch (NumberFormatException e) {
//					
//					}
				break;
					
				case 3:
					System.out.println("Are you sure you can to exit?");
					System.out.println("1. Yes \n2. No");
					try {
						exit_ip = Integer.parseInt(ip.nextLine());
						if (exit_ip == 1) {
							System.out.println("Thank you");
						}
						else {
							
						}
					}
					catch (NumberFormatException e) {
					}
					
				break;
				} 
				
		}
			while (exit_ip !=1);
		
		}
				catch(Exception e) {
		
	}
	
}
}
