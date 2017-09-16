package converge;
import java.io.IOException;
import java.util.Vector;
import java.util.Scanner;

public class Main {
	public static void main(String []args) throws IOException
	{
		FileRead fr = new FileRead();
		Vector<Event> events = fr.readEvents();
		Scanner myScan = new Scanner(System.in);
		String userName = "";
		int eventChoice = 0;
		int timeChoice = 0;
		System.out.println("Please enter your name.");
		userName = myScan.nextLine();
		/*System.out.println("Which event would you like to join?");
		System.out.println("Please enter the number cooresponding to your event choice.");
		for(int i=0; i<events.size(); i++) {
			System.out.println((i+1)+". "+events.elementAt(i).getEventName());
		}
		eventChoice = myScan.nextInt();*/
		boolean invalidInput = true;
		while(invalidInput) {
			System.out.println("Which event would you like to join?");
			System.out.println("Please enter the number cooresponding to your event choice.");
			for(int i=0; i<events.size(); i++) {
				System.out.println((i+1)+". "+events.elementAt(i).getEventName());
			}
			eventChoice = myScan.nextInt();
			if(eventChoice > events.size() || eventChoice < 1) {
				System.out.println("Invalid input. Try again.");
			}
			else {
				invalidInput = false;
			}
		}
		boolean wrongFormat = true;
		while (wrongFormat) {
			System.out.println("Enter 12 for time options in Standard time.");
			System.out.println("Enter 24 for time options in Military time.");
			timeChoice = myScan.nextInt();
			if(timeChoice == 12) {
				for(int i=0; i<events.size(); i++) {
					if(i+1 == eventChoice) {
						events.elementAt(i).get12HourAvailability();
					}
				}
				wrongFormat = false;
			}
			else if(timeChoice == 24) {
				for(int i=0; i<events.size(); i++) {
					if(i+1 == eventChoice) {
						events.elementAt(i).get24HourAvailability();
					}
				}
				wrongFormat = false;
			}
			else {
				System.out.println("Invalid input. Try again.");
			}
		}
		
		
	}
}
