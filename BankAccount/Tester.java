package Bank;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		BankAccount meet = new BankAccount("9024532942", 1000, "Meet Patel", "meetpatel@gmail.com", "3108809101");
		Scanner sc = new Scanner(System.in);		
		
		while (true){
			System.out.println("Choose: \n 1.Account Balance \n 2.Deposit Money \n 3.Withdraw Money \n 0.Exit");			
			int res = sc.nextInt();
			if (res == 0){
				break;
			}
			switch (res) {
				case 1: 
					System.out.println(meet.getInfo());
					break;
				case 2:
					System.out.println("How much do you want to deposit?");
					double amount = sc.nextDouble();
					meet.depositFunds(amount);
					System.out.println("Success! Deposited: " + amount);
					System.out.println(meet.getInfo());
					break;
				case 3:
					System.out.println("How much do you want to withdraw?");
					double amount2 = sc.nextDouble();
					meet.withdrawFunds(amount2);
					System.out.println("Success! Dispensing: " + amount2);
					System.out.println(meet.getInfo());
					break;
				default:
					System.out.println("Wrong input");
					break;
				 
				}
		}
		

		
	}

}
