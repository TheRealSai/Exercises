package basicPrograms;

import java.util.Scanner;

public class CharSwitch {
	public static void main(String[] args) {
		System.out.println("Enter alphabet: ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().toLowerCase().charAt(0);
		
		
		switch (c){
		case 'a':
		//case 'A':
		
			System.out.println("apple");
			break;
		case 'b':
		//case 'B':
			System.out.println("banana");
			break;
		default:
			System.out.println("Not in basket");
		}
		
	}
}
