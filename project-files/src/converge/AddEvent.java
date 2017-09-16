package converge;

import java.util.Scanner;
import java.util.Vector;

public class AddEvent{
	
	public String twelveHourConversion(int i) //method will convert the ints placed in the vectors to the needed strings for 12 hour mode
	{
		String conversion = "\0";
		
		if(i==0)
		{
			conversion = "12:00AM";
		}
		if(i==1)
		{
			conversion = "12:30AM";
		}
		if(i==2)
		{
			conversion = "1:00AM";
		}
		if(i==3)
		{
			conversion = "1:30AM";
		}
		if(i==4)
		{
			conversion = "2:00AM";
		}
		if(i==5)
		{
			conversion = "2:30AM";
		}
		if(i==6)
		{
			conversion = "3:00AM";
		}
		if(i==7)
		{
			conversion = "3:30AM";
		}
		if(i==8)
		{
			conversion = "4:00AM";
		}
		if(i==9)
		{
			conversion = "4:30AM";
		}
		if(i==10)
		{
			conversion = "5:00AM";
		}
		if(i==11)
		{
			conversion = "5:30AM";
		}
		if(i==12)
		{
			conversion = "6:00AM";
		}
		if(i==13)
		{
			conversion = "6:30AM";
		}
		if(i==14)
		{
			conversion = "7:00AM";
		}
		if(i==15)
		{
			conversion = "7:30AM";
		}
		if(i==16)
		{
			conversion = "8:00AM";
		}
		if(i==17)
		{
			conversion = "8:30AM";
		}
		if(i==18)
		{
			conversion = "9:00AM";
		}
		if(i==19)
		{
			conversion = "9:30AM";
		}
		if(i==20)
		{
			conversion = "10:00AM";
		}
		if(i==21)
		{
			conversion = "10:30AM";
		}
		if(i==22)
		{
			conversion = "11:00AM";
		}
		if(i==23)
		{
			conversion = "11:30AM";
		}
		if(i==24)
		{
			conversion = "12:00PM";
		}
		if(i==25)
		{
			conversion = "12:30PM";
		}
		if(i==26)
		{
			conversion = "1:00PM";
		}
		if(i==27)
		{
			conversion = "1:30PM";
		}
		if(i==28)
		{
			conversion = "2:00PM";
		}
		if(i==29)
		{
			conversion = "2:30PM";
		}
		if(i==30)
		{
			conversion = "3:00PM";
		}
		if(i==31)
		{
			conversion = "3:30PM";
		}
		if(i==32)
		{
			conversion = "4:00PM";
		}
		if(i==33)
		{
			conversion = "4:30PM";
		}
		if(i==34)
		{
			conversion = "5:00PM";
		}
		if(i==35)
		{
			conversion = "5:30PM";
		}
		if(i==36)
		{
			conversion = "6:00PM";
		}
		if(i==37)
		{
			conversion = "6:30PM";
		}
		if(i==38)
		{
			conversion = "7:00PM";
		}
		if(i==39)
		{
			conversion = "7:30PM";
		}
		if(i==40)
		{
			conversion = "8:00PM";
		}
		if(i==41)
		{
			conversion = "8:30PM";
		}
		if(i==42)
		{
			conversion = "9:00PM";
		}
		if(i==43)
		{
			conversion = "9:30PM";
		}
		if(i==44)
		{
			conversion = "10:00PM";
		}
		if(i==45)
		{
			conversion = "10:30PM";
		}
		if(i==46)
		{
			conversion = "11:00PM";
		}
		if(i==47)
		{
			conversion = "11:30PM";
		}
		return conversion;
	}
	
	public String twentyFourHourConversion(int i) //method converts ints in vecs into corresponding strings for 24:00 hour mode;
	{
		String conversion = "\0";
		
		if(i==0)
		{
			conversion = "0:00";
		}
		if(i==1)
		{
			conversion = "0:30";
		}
		if(i==2)
		{
			conversion = "1:00";
		}
		if(i==3)
		{
			conversion = "1:30";
		}
		if(i==4)
		{
			conversion = "2:00";
		}
		if(i==5)
		{
			conversion = "2:30";
		}
		if(i==6)
		{
			conversion = "3:00";
		}
		if(i==7)
		{
			conversion = "3:30";
		}
		if(i==8)
		{
			conversion = "4:00";
		}
		if(i==9)
		{
			conversion = "4:30";
		}
		if(i==10)
		{
			conversion = "5:00";
		}
		if(i==11)
		{
			conversion = "5:30";
		}
		if(i==12)
		{
			conversion = "6:00";
		}
		if(i==13)
		{
			conversion = "6:30";
		}
		if(i==14)
		{
			conversion = "7:00";
		}
		if(i==15)
		{
			conversion = "7:30";
		}
		if(i==16)
		{
			conversion = "8:00";
		}
		if(i==17)
		{
			conversion = "8:30";
		}
		if(i==18)
		{
			conversion = "9:00";
		}
		if(i==19)
		{
			conversion = "9:30";
		}
		if(i==20)
		{
			conversion = "10:00";
		}
		if(i==21)
		{
			conversion = "10:30";
		}
		if(i==22)
		{
			conversion = "11:00";
		}
		if(i==23)
		{
			conversion = "11:30";
		}
		if(i==24)
		{
			conversion = "12:00";
		}
		if(i==25)
		{
			conversion = "12:30";
		}
		if(i==26)
		{
			conversion = "13:00";
		}
		if(i==27)
		{
			conversion = "13:30";
		}
		if(i==28)
		{
			conversion = "14:00";
		}
		if(i==29)
		{
			conversion = "14:30";
		}
		if(i==30)
		{
			conversion = "15:00";
		}
		if(i==31)
		{
			conversion = "15:30";
		}
		if(i==32)
		{
			conversion = "16:00";
		}
		if(i==33)
		{
			conversion = "16:30";
		}
		if(i==34)
		{
			conversion = "17:00";
		}
		if(i==35)
		{
			conversion = "17:30";
		}
		if(i==36)
		{
			conversion = "18:00";
		}
		if(i==37)
		{
			conversion = "18:30";
		}
		if(i==38)
		{
			conversion = "19:00";
		}
		if(i==39)
		{
			conversion = "19:30";
		}
		if(i==40)
		{
			conversion = "20:00";
		}
		if(i==41)
		{
			conversion = "20:30";
		}
		if(i==42)
		{
			conversion = "21:00";
		}
		if(i==43)
		{
			conversion = "21:30";
		}
		if(i==44)
		{
			conversion = "22:00";
		}
		if(i==45)
		{
			conversion = "22:30";
		}
		if(i==46)
		{
			conversion = "23:00";
		}
		if(i==47)
		{
			conversion = "23:30";
		}
		return conversion;
	}
	
	public int twelveHourtoInt(String time)//this method will take a String in 12 hour and return its corresponding int. 
	{
		int timeAsInt; //variable that will convert string into the corresponding number
		
		if(time == "12:00AM")
		{
			timeAsInt = 0;
		}
		else if(time == "12:30AM")
		{
			timeAsInt = 1;
		}
		else if(time == "1:00AM")
		{
			timeAsInt = 2;
		}
		else if(time == "1:30AM")
		{
			timeAsInt = 3;
		}
		else if(time == "2:00AM")
		{
			timeAsInt = 4;
		}
		else if(time == "2:30AM")
		{
			timeAsInt = 5;
		}
		else if(time == "3:00AM")
		{
			timeAsInt = 6;
		}
		else if(time == "3:30AM")
		{
			timeAsInt = 7;
		}
		else if(time == "4:00AM")
		{
			timeAsInt = 8;
		}
		else if(time == "4:30AM")
		{
			timeAsInt = 9;
		}
		else if(time == "5:00AM")
		{
			timeAsInt = 10;
		}
		else if(time == "5:30AM")
		{
			timeAsInt = 11;
		}
		else if(time == "6:00AM")
		{
			timeAsInt = 12;
		}
		else if(time == "6:30AM")
		{
			timeAsInt = 13;
		}
		else if(time == "7:00AM")
		{
			timeAsInt = 14;
		}
		else if(time == "7:30AM")
		{
			timeAsInt = 15;
		}
		else if(time == "8:00AM")
		{
			timeAsInt = 16;
		}
		else if(time == "8:30AM")
		{
			timeAsInt = 17;
		}
		else if(time == "9:00AM")
		{
			timeAsInt = 18;
		}
		else if(time == "9:30AM")
		{
			timeAsInt = 19;
		}
		else if(time == "10:00AM")
		{
			timeAsInt = 20;
		}
		else if(time == "10:30AM")
		{
			timeAsInt = 21;
		}
		else if(time == "11:00AM")
		{
			timeAsInt = 22;
		}
		else if(time == "11:30AM")
		{
			timeAsInt = 23;
		}
		else if(time == "12:00PM")
		{
			timeAsInt = 24;
		}
		else if(time == "12:30PM")
		{
			timeAsInt = 25;
		}
		else if(time == "1:00PM")
		{
			timeAsInt = 26;
		}
		else if(time == "1:30PM")
		{
			timeAsInt = 27;
		}
		else if(time == "2:00PM")
		{
			timeAsInt = 28;
		}
		else if(time == "2:30PM")
		{
			timeAsInt = 29;
		}
		else if(time == "3:00PM")
		{
			timeAsInt = 30;
		}
		else if(time == "3:30PM")
		{
			timeAsInt = 31;
		}
		else if(time == "4:00PM")
		{
			timeAsInt = 32;
		}
		else if(time == "4:30PM")
		{
			timeAsInt = 33;
		}
		else if(time == "5:00PM")
		{
			timeAsInt = 34;
		}
		else if(time == "5:30PM")
		{
			timeAsInt = 35;
		}
		else if(time == "6:00PM")
		{
			timeAsInt = 36;
		}
		else if(time == "6:30PM")
		{
			timeAsInt = 37;
		}
		else if(time == "7:00PM")
		{
			timeAsInt = 38;
		}
		else if(time == "7:30PM")
		{
			timeAsInt = 39;
		}
		else if(time == "8:00PM")
		{
			timeAsInt = 40;
		}
		else if(time == "8:30PM")
		{
			timeAsInt = 41;
		}
		else if(time == "9:00PM")
		{
			timeAsInt = 42;
		}
		else if(time == "9:30PM")
		{
			timeAsInt = 43;
		}
		else if(time == "10:00PM")
		{
			timeAsInt = 44;
		}
		else if(time == "10:30PM")
		{
			timeAsInt = 45;
		}
		else if(time == "11:00PM")
		{
			timeAsInt = 46;
		}
		else if(time == "11:30PM")
		{
			timeAsInt = 47;
		}
		else
		{
			timeAsInt = 50; //random value that for all other cases that will throw an error if the time isn't one of the above.
		}
		return timeAsInt;
	}
	
	public int twentyFourHourtoInt(String time)//this method will take a String in 24 hour and return its corresponding int. 
	{
		int timeAsInt; //variable that will convert string into the corresponding number
		
		if(time == "0:00")
		{
			timeAsInt = 0;
		}
		else if(time == "0:30")
		{
			timeAsInt = 1;
		}
		else if(time == "1:00")
		{
			timeAsInt = 2;
		}
		else if(time == "1:30")
		{
			timeAsInt = 3;
		}
		else if(time == "2:00")
		{
			timeAsInt = 4;
		}
		else if(time == "2:30")
		{
			timeAsInt = 5;
		}
		else if(time == "3:00")
		{
			timeAsInt = 6;
		}
		else if(time == "3:30")
		{
			timeAsInt = 7;
		}
		else if(time == "4:00")
		{
			timeAsInt = 8;
		}
		else if(time == "4:30")
		{
			timeAsInt = 9;
		}
		else if(time == "5:00")
		{
			timeAsInt = 10;
		}
		else if(time == "5:30")
		{
			timeAsInt = 11;
		}
		else if(time == "6:00")
		{
			timeAsInt = 12;
		}
		else if(time == "6:30")
		{
			timeAsInt = 13;
		}
		else if(time == "7:00")
		{
			timeAsInt = 14;
		}
		else if(time == "7:30")
		{
			timeAsInt = 15;
		}
		else if(time == "8:00")
		{
			timeAsInt = 16;
		}
		else if(time == "8:30")
		{
			timeAsInt = 17;
		}
		else if(time == "9:00")
		{
			timeAsInt = 18;
		}
		else if(time == "9:30")
		{
			timeAsInt = 19;
		}
		else if(time == "10:00")
		{
			timeAsInt = 20;
		}
		else if(time == "10:30")
		{
			timeAsInt = 21;
		}
		else if(time == "11:00")
		{
			timeAsInt = 22;
		}
		else if(time == "11:30")
		{
			timeAsInt = 23;
		}
		else if(time == "12:00")
		{
			timeAsInt = 24;
		}
		else if(time == "12:30")
		{
			timeAsInt = 25;
		}
		else if(time == "13:00")
		{
			timeAsInt = 26;
		}
		else if(time == "13:30")
		{
			timeAsInt = 27;
		}
		else if(time == "14:00")
		{
			timeAsInt = 28;
		}
		else if(time == "14:30")
		{
			timeAsInt = 29;
		}
		else if(time == "15:00")
		{
			timeAsInt = 30;
		}
		else if(time == "15:30")
		{
			timeAsInt = 31;
		}
		else if(time == "16:00")
		{
			timeAsInt = 32;
		}
		else if(time == "16:30")
		{
			timeAsInt = 33;
		}
		else if(time == "17:00")
		{
			timeAsInt = 34;
		}
		else if(time == "17:30")
		{
			timeAsInt = 35;
		}
		else if(time == "18:00")
		{
			timeAsInt = 36;
		}
		else if(time == "18:30")
		{
			timeAsInt = 37;
		}
		else if(time == "19:00")
		{
			timeAsInt = 38;
		}
		else if(time == "19:30")
		{
			timeAsInt = 39;
		}
		else if(time == "20:00")
		{
			timeAsInt = 40;
		}
		else if(time == "20:30")
		{
			timeAsInt = 41;
		}
		else if(time == "21:00")
		{
			timeAsInt = 42;
		}
		else if(time == "21:30")
		{
			timeAsInt = 43;
		}
		else if(time == "22:00")
		{
			timeAsInt = 44;
		}
		else if(time == "22:30")
		{
			timeAsInt = 45;
		}
		else if(time == "23:00")
		{
			timeAsInt = 46;
		}
		else if(time == "23:30")
		{
			timeAsInt = 47;
		}
		else
		{
			timeAsInt = 50; //random value that for all other cases that will throw an error if the time isn't one of the above.
		}
		return timeAsInt;
	}
	int choice; //int used to track choice made by user
	String startAvailability; //string used to store the start of the admin availability
	String endAvailability; //string used to store the end of the admin availability
	Vector<Integer> timeVec = new Vector<Integer>() ;{ //vector that will hold ints 0-47 each which represents a certain availability.
	for (int i = 0; i < 48; i++)
	{
		timeVec.addElement(i);
	}
	Event adminEvent = new Event();
	
	Scanner userInput = new Scanner(System.in); //Scanner object allows for user input
	
	System.out.println("Enter the name of the event: ");
	
	adminEvent.setEventName(userInput.next());
	
	System.out.println("Enter the year of the event as an integer: ");
	adminEvent.setYear(userInput.nextInt());
	
	System.out.println("Enter the Month of the event as an integer: ");
	
	adminEvent.setMonth(userInput.nextInt());
	
	System.out.println("Enter the Day of the event as an integer: ");
	
	adminEvent.setDay(userInput.nextInt());
	
	System.out.println("Would you like the time to be displayed in 12 hour or 24 hour mode?\n");
	System.out.println("Enter 12 for 12 hour mode or 24 for 24 hour mode\n");
	System.out.println("Choice: ");
	choice = userInput.nextInt();
	if (choice == 12)
	{
		System.out.println("These are all the available time slots in 12 hour mode\n");
		for (int i=0; i<48; i++) //prints all time slots in a day in 12 hour mode
		{
			System.out.println(twelveHourConversion(timeVec.get(i)));
			System.out.println(" ");
		}
		System.out.println("\n");
		System.out.println("When you type in your availability, type them in the format above.\n");
		System.out.println("For Example: If you wanted to start at 1 PM, type '1:00PM'\n");
		System.out.println("Type the start time you are available: ");
		startAvailability = userInput.next();
		while( twelveHourtoInt( startAvailability ) == 50 ) //checks to see if the time the user input is valid
		{
			System.out.println("Invalid Input. Please type the start time of your availability in the same format as follows.\n");
			System.out.println("For Example: If you wanted to start at 1 PM, type '1:00PM'\n");
			System.out.println("Starting Availibility: ");
			startAvailability = userInput.next();
		}
		System.out.println("Type the end time you are available until: ");
		endAvailability = userInput.next();
		while( (twelveHourtoInt( endAvailability ) == 50) || (twelveHourtoInt(endAvailability) < twelveHourtoInt(startAvailability)) ) //checks to see if the time the user input was valid
		{
			if (twelveHourtoInt( endAvailability ) == 50) //if the String the user input isn't valid
			{
				System.out.println("Invalid Input. Please type the end time of your availability in the same format as below.\n");
				System.out.println("For Example: If you are available until 5PM, type '5:00PM' \n");
				System.out.println("Available until: ");
				endAvailability = userInput.next();
			}
			else if (twelveHourtoInt(endAvailability) < twelveHourtoInt(startAvailability)) //if the time the user input is before their start time
			{
				System.out.println("Please input an ending time that is after the start time you have indicated\n");
				System.out.println("Available until: ");
				endAvailability = userInput.next();
			}
		}
		
		for( int i = twelveHourtoInt(startAvailability); i<twelveHourtoInt(endAvailability); i++)
		{
			adminEvent.a_adminAvailability.addElement(i); //adds the availability times of the admin
		}
			
		
	}
	else if (choice == 24)
	{
		for (int i=0; i<48; i++)
		{
			System.out.println(twentyFourHourConversion(timeVec.get(i)));
			System.out.println(" ");
		}
	}	
	else
	{
		System.out.println("That is an invalid choice. Please select 12 for 12 hour mode and 24 for 24 hour mode\n");
		System.out.println("Choice: ");
	}
	
	
	
	userInput.close();
}
}

