import converge.Event;

import java.util.Scanner;

public class AddEvent{
	
	int choice;
	Vector timeVec = new Vector<int>();
	for (int i = 0; i < 48; i++)
	{
		timeVec.addElement(i);
	}
	public Event() newEvent;
	
	Scanner userInput = new Scanner(System.in); //allows for user input
	
	System.out.println("Enter the name of the event: ");
	
	newEvent.setEventName = userInput.nextString();
	
	System.out.println("Enter the Month of the event: ");
	
	newEvent.setMonth() = userInput.nextInt();
	
	System.out.println("Enter the Day of the event: ");
	
	newEvent.setDay() = userInput.nextInt();
	
	System.outprintln("Would you like the time to be displayed in 12 hour or 24 hour mode?\n");
	System.outprintln("Enter 12 for 12 hour mode or 24 for 24 hour mode\n");
	System.outprintln("Choice: ");
	choice = userInput.nextInt();
	if (choice == 12)
	{
		
	}
	else if (choice == 24)
	{
		
	}
	else
	{
		System.out.println("That is an invalid choice. Please select 12 for 12 hour mode and 24 for 24 hour mode\n");
		System.outprintln("Choice: ");
	}
	System.out.println("Enter the year of the event: ");
	newEvent.setYear() = userInput.nextYear();
	
	
	
}