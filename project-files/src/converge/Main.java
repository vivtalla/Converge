package converge;
import java.io.IOException;
import java.util.Vector;
import java.util.Scanner;

public class Main {
	public static void main(String []args) throws IOException
	{
		Scanner myScan = new Scanner(System.in);
		String choice = "";
		boolean incorrectInput = true;
		int c = 0;
		while(incorrectInput) {
			System.out.println("What would you like to do?/n 1. Create an Event/n 2. Join an event/n Please enter number corresponding to the option you choose.");
			choice = myScan.nextLine();
			if(isInteger(choice)) {
				c = Integer.valueOf(choice);
				if(c == 1 || c == 2) {
					incorrectInput = false;
				}
				else {
					System.out.println("Invalid input. Please enter option 1 or 2.");
				}
			}
			else {
				System.out.println("Invalid input. Please enter option 1 or 2.");
			}
		}
		myScan.close();
	}
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
}
