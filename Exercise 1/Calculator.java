package basicPrograms;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number 1:");
		double d1 = sc.nextDouble();
		System.out.println("Enter number 2:");
		double d2 = sc.nextDouble();
		
		System.out.println("What do you want to do? \n 1. add \n 2. subtract \n 3. Multiply \n 4. Divide \n 5. Mod");
		
		int math = sc.nextInt();
		
		System.out.println(Calc(d1,d2,math));
		
		
	}
	
	private static double Calc(double d1, double d2, int math){
		
		
		switch (math){
		case 1: 
			return d1 + d2;
		case 2: 
			return d1 - d2;
		case 3: 
			return d1*d2;
		case 4: 
			return d1/d2;
		case 5: 
			return d1%d2;
		}
		
		return 0;
	}
}
