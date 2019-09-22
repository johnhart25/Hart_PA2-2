package Hart_p1;

import java.util.Scanner;

public class Hart_p1 
{

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		
		//Declares the variables.//
		final int NUM_INT = 4;
		int [] passcode = new int[NUM_INT];
		int placeHold;
		
		
		//Gets the digits for the code.//
		System.out.print("Please enter a 4 digit code: ");
		passcode[0] = scnr.nextInt();
		passcode[1] = scnr.nextInt();
		passcode[2] = scnr.nextInt();
		passcode[3] = scnr.nextInt();
		
		//Displays the 4 digits entered for the code.//
		System.out.println("The integer you entered is: " + passcode[0] + passcode[1] + passcode[2] + passcode[3] + "\n");
		
		//Encrypts the code.//
		passcode[0] = (passcode[0] + 7) % 10;
		passcode[1] = (passcode[1] + 7) % 10;
		passcode[2] = (passcode[2] + 7) % 10;
		passcode[3] = (passcode[3] + 7) % 10;
		
		
		//Swaps the integers.//
		placeHold = passcode[0];
		passcode[0] = passcode[2];
		passcode[2] = placeHold;
		placeHold = passcode[1];
		passcode[1] = passcode[3];
		passcode[3] = placeHold;
			
		//Displays the encrypted integer.//
		System.out.println("The encrypted integer is now: " + passcode[0] + passcode[1] + passcode[2] + passcode[3]);
		
		//Asks the user to input the encrypted code.//
		System.out.print("\nPlease enter the encrypted 4 digit code: ");
		passcode[0] = scnr.nextInt();
		passcode[1] = scnr.nextInt();
		passcode[2] = scnr.nextInt();
		passcode[3] = scnr.nextInt();
		
		//Reverses the swapping of the integers.//
		placeHold = passcode[2];
		passcode[2] = passcode[0];
		passcode[0] = placeHold;
		placeHold = passcode[3];
		passcode[3] = passcode[1];
		passcode[1] = placeHold;
		
		//Calculates and returns the encrypted code back to normal.
		passcode[0] = (passcode[0] * 10) - 7;
		passcode[1] = (passcode[1] * 10) - 7;
		passcode[2] = (passcode[2] * 10) - 7;
		passcode[3] = (passcode[3] * 10) - 7;
		
		System.out.println("The encrypted integer is now: " + passcode[0] + passcode[1] + passcode[2] + passcode[3]);
	}
}

