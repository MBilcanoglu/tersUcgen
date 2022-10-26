package tersUcgen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Basamak sayısı giriniz: ");
		count=scan.nextInt();
		
		for(int i=count; i>=0; i--) {
			for(int k=0; k<(count-i)+1; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
