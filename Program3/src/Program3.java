// Application:	Program 3
// Name:		Jalen M
// GitHub User: Dorwits
// Date:		Sep 29
// Version:		1.0
// Description:	Using While and Do/While loops

import java.util.Scanner;

public class Program3 {

public class method { }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner text = new Scanner(System.in);
	
		
			//Collect user name and rdm number
		System.out.println("What is your name?");
		String name = text.next();
		System.out.println("Choose a number");
		int number = text.nextInt();
		
		
		
		do {
			//Ask for a number
			System.out.println("Choose a number");
			number = text.nextInt();
			
			if (number<0 || number>100) {
				System.out.println("Choose a different number");
			}
		
		}while(number<0 || number>100);
		
		
		System.out.println("Thank you for your input " + name);
		
		//Count down from input number
		for(int x=number; x>0; x--) {
			System.out.println(x + " seconds til launch" );
			
		}


}
}