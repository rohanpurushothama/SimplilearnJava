package array_demo;

public class demo1 {

	public static void main(String[] args) {
		int ar[] = {12,2,3,45,6,6,6,7,8,9};
		for (int i =0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("\nWith for-each loop");
		for(int x:ar) {
			System.out.println(x+" ");
	
		}
		
		int ar1[]= new int[10];
		ar1[0]=90;
		ar1[1]=80;
		ar1[2]=70;
		ar1[3]=60;
		System.out.println("\nPrinting ar1 with for each loop");
		for (int x:ar1) {
			System.out.println(x+ " ");
		}
		
		int newele=100;
		int pos=1;
		int n=4;
		for (int i=n; i>=pos; i--) {
			ar1[i]=ar1[i-1];
		}
		ar1[pos-1]=newele;
		n++;
		
		System.out.println("\nPrinting afrer insertion");
		for (int x:ar1) {
			System.out.println(x+ " ");
	}
	
	
	
}
}
