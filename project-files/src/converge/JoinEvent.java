package converge;
import java.io.IOException;
import java.util.Vector;
import java.util.Scanner;

public class JoinEvent {
	static void run()throws IOException {
		FileRead fr = new FileRead();
		Vector<Event> events = fr.readEvents();
		Vector<Integer> times=new Vector<Integer>();
		Scanner myScan = new Scanner(System.in);
		String userName = "";
		int eventChoice = 0;
		int timeChoice = 0;
		clearPrint("Please enter your name.");
		userName = myScan.nextLine();
		boolean invalidInput = true;
		clearScreen();
		while(invalidInput) 
		{
			System.out.println("Which event would you like to join?");
			System.out.println("Please enter the number cooresponding to your event choice.\n");
			for(int i=0; i<events.size(); i++) 
			{
				System.out.println((i+1)+". "+events.elementAt(i).getEventName());
			}
				eventChoice = myScan.nextInt();
				if(eventChoice > events.size() || eventChoice < 1) 
				{
					clearPrint("Error\nThe selection is invalid.\n");
					invalidInput = true;
				}
				else 
				{
					invalidInput = false;
				}
		}
				clearScreen();
				boolean wrongFormat = true;
				while (wrongFormat) {
					System.out.println("12 Hour / 24 Hour Mode? (12/24):");	
					timeChoice = myScan.nextInt();
					if(timeChoice == 12) 
					{
						clearPrint("The available times:");
						for(int i=0; i<events.size(); i++) 
						{
							if(i+1 == eventChoice) 
							{
								events.elementAt(i).get12HourAvailability();
							}
						}
						wrongFormat = false;
					}
					else if(timeChoice == 24) 
					{
						clearPrint("The available times:");
						for(int i=0; i<events.size(); i++) 
						{
							if(i+1 == eventChoice) 
							{
								events.elementAt(i).get24HourAvailability();
							}
						}
						wrongFormat = false;
					}
					else
					{
						clearPrint("Error\nThe selection is invalid.\n");
					}
				}
				boolean correctTime = false;
				while(!correctTime) {
					System.out.println("Please enter all the times you are available within the given time options(seperate with commas).");
					String s = "";
					myScan.nextLine();
					s = myScan.nextLine();
					String[] temp = s.split(",");
					for(int i = 0; i<temp.length; i++) 
					{
						boolean correctValueFound = false;
						Integer num = twelveHourtoInt(temp[i]);
						for(int j=0; j<events.elementAt(eventChoice-1).getAvailability().size(); j++) 
						{
							if(num == events.elementAt(eventChoice-1).getAvailability().elementAt(j)) 
							{
								j=events.elementAt(eventChoice-1).getAvailability().size();
								correctValueFound = true;
								times.add(num);
							}
						}
						if(!correctValueFound) 
						{
							i = temp.length;
							correctTime = false;
							clearPrint("Error\nThe values inputted are invalid.");
							if(timeChoice == 12) 
							{
								System.out.println("The available times:");
								for(int j=0; j<events.size(); j++) 
								{
									if(j+1 == eventChoice) 
									{
										events.elementAt(j).get12HourAvailability();
									}
								}
							}
							else if(timeChoice == 24) 
							{
								System.out.println("The available times:");
								for(int j=0; j<events.size(); j++) 
								{
									if(j+1 == eventChoice) 
									{
										events.elementAt(j).get24HourAvailability();
									}
								}
							}
						}
						else
						{
							correctTime = true;
						}
					}
				}
				System.out.println(times);
				Attendee a = new Attendee(userName, times);
				events.elementAt(eventChoice).a_attendees.add(a);
				events.elementAt(eventChoice).exportEvent();
				clearPrint("You have successfully been added to the event " + events.elementAt(eventChoice).getEventName() + "!");

	}
	static int twelveHourtoInt(String time)//this method will take a String in 12 hour and return its corresponding int. 
	{
		int timeAsInt; //variable that will convert string into the corresponding number
		
		if(time.equals("12:00AM"))
		{
			timeAsInt = 0;
		}
		else if(time.equals( "12:30AM"))
		{
			timeAsInt = 1;
		}
		else if(time.equals( "1:00AM"))
		{
			timeAsInt = 2;
		}
		else if(time.equals( "1:30AM"))
		{
			timeAsInt = 3;
		}
		else if(time.equals( "2:00AM"))
		{
			timeAsInt = 4;
		}
		else if(time.equals( "2:30AM"))
		{
			timeAsInt = 5;
		}
		else if(time.equals( "3:00AM"))
		{
			timeAsInt = 6;
		}
		else if(time.equals( "3:30AM"))
		{
			timeAsInt = 7;
		}
		else if(time.equals( "4:00AM"))
		{
			timeAsInt = 8;
		}
		else if(time.equals( "4:30AM"))
		{
			timeAsInt = 9;
		}
		else if(time.equals( "5:00AM"))
		{
			timeAsInt = 10;
		}
		else if(time.equals( "5:30AM"))
		{
			timeAsInt = 11;
		}
		else if(time.equals( "6:00AM"))
		{
			timeAsInt = 12;
		}
		else if(time.equals( "6:30AM"))
		{
			timeAsInt = 13;
		}
		else if(time.equals( "7:00AM"))
		{
			timeAsInt = 14;
		}
		else if(time.equals( "7:30AM"))
		{
			timeAsInt = 15;
		}
		else if(time.equals( "8:00AM"))
		{
			timeAsInt = 16;
		}
		else if(time.equals( "8:30AM"))
		{
			timeAsInt = 17;
		}
		else if(time.equals( "9:00AM"))
		{
			timeAsInt = 18;
		}
		else if(time.equals( "9:30AM"))
		{
			timeAsInt = 19;
		}
		else if(time.equals( "10:00AM"))
		{
			timeAsInt = 20;
		}
		else if(time.equals( "10:30AM"))
		{
			timeAsInt = 21;
		}
		else if(time.equals( "11:00AM"))
		{
			timeAsInt = 22;
		}
		else if(time.equals( "11:30AM"))
		{
			timeAsInt = 23;
		}
		else if(time.equals( "12:00PM"))
		{
			timeAsInt = 24;
		}
		else if(time.equals( "12:30PM"))
		{
			timeAsInt = 25;
		}
		else if(time.equals( "1:00PM"))
		{
			timeAsInt = 26;
		}
		else if(time.equals( "1:30PM"))
		{
			timeAsInt = 27;
		}
		else if(time.equals( "2:00PM"))
		{
			timeAsInt = 28;
		}
		else if(time.equals( "2:30PM"))
		{
			timeAsInt = 29;
		}
		else if(time.equals( "3:00PM"))
		{
			timeAsInt = 30;
		}
		else if(time.equals( "3:30PM"))
		{
			timeAsInt = 31;
		}
		else if(time.equals( "4:00PM"))
		{
			timeAsInt = 32;
		}
		else if(time.equals( "4:30PM"))
		{
			timeAsInt = 33;
		}
		else if(time.equals( "5:00PM"))
		{
			timeAsInt = 34;
		}
		else if(time.equals( "5:30PM"))
		{
			timeAsInt = 35;
		}
		else if(time.equals( "6:00PM"))
		{
			timeAsInt = 36;
		}
		else if(time.equals( "6:30PM"))
		{
			timeAsInt = 37;
		}
		else if(time.equals( "7:00PM"))
		{
			timeAsInt = 38;
		}
		else if(time.equals( "7:30PM"))
		{
			timeAsInt = 39;
		}
		else if(time.equals( "8:00PM"))
		{
			timeAsInt = 40;
		}
		else if(time.equals( "8:30PM"))
		{
			timeAsInt = 41;
		}
		else if(time.equals( "9:00PM"))
		{
			timeAsInt = 42;
		}
		else if(time.equals( "9:30PM"))
		{
			timeAsInt = 43;
		}
		else if(time.equals( "10:00PM"))
		{
			timeAsInt = 44;
		}
		else if(time.equals( "10:30PM"))
		{
			timeAsInt = 45;
		}
		else if(time.equals( "11:00PM"))
		{
			timeAsInt = 46;
		}
		else if(time.equals( "11:30PM"))
		{
			timeAsInt = 47;
		}
		else
		{
			timeAsInt = 50; //random value that for all other cases that will throw an error if the time isn't one of the above.
		}
		return timeAsInt;
	}
	
	static int twentyFourHourtoInt(String time)//this method will take a String in 24 hour and return its corresponding int. 
	{
		int timeAsInt; //variable that will convert string into the corresponding number
		
		if(time.equals( "0:00"))
		{
			timeAsInt = 0;
		}
		else if(time.equals( "0:30"))
		{
			timeAsInt = 1;
		}
		else if(time.equals( "1:00"))
		{
			timeAsInt = 2;
		}
		else if(time.equals( "1:30"))
		{
			timeAsInt = 3;
		}
		else if(time.equals( "2:00"))
		{
			timeAsInt = 4;
		}
		else if(time.equals( "2:30"))
		{
			timeAsInt = 5;
		}
		else if(time.equals( "3:00"))
		{
			timeAsInt = 6;
		}
		else if(time.equals( "3:30"))
		{
			timeAsInt = 7;
		}
		else if(time.equals( "4:00"))
		{
			timeAsInt = 8;
		}
		else if(time.equals( "4:30"))
		{
			timeAsInt = 9;
		}
		else if(time.equals( "5:00"))
		{
			timeAsInt = 10;
		}
		else if(time.equals( "5:30"))
		{
			timeAsInt = 11;
		}
		else if(time.equals( "6:00"))
		{
			timeAsInt = 12;
		}
		else if(time.equals( "6:30"))
		{
			timeAsInt = 13;
		}
		else if(time.equals( "7:00"))
		{
			timeAsInt = 14;
		}
		else if(time.equals( "7:30"))
		{
			timeAsInt = 15;
		}
		else if(time.equals( "8:00"))
		{
			timeAsInt = 16;
		}
		else if(time.equals( "8:30"))
		{
			timeAsInt = 17;
		}
		else if(time.equals( "9:00"))
		{
			timeAsInt = 18;
		}
		else if(time.equals( "9:30"))
		{
			timeAsInt = 19;
		}
		else if(time.equals( "10:00"))
		{
			timeAsInt = 20;
		}
		else if(time.equals( "10:30"))
		{
			timeAsInt = 21;
		}
		else if(time.equals( "11:00"))
		{
			timeAsInt = 22;
		}
		else if(time.equals( "11:30"))
		{
			timeAsInt = 23;
		}
		else if(time.equals( "12:00"))
		{
			timeAsInt = 24;
		}
		else if(time.equals( "12:30"))
		{
			timeAsInt = 25;
		}
		else if(time.equals( "13:00"))
		{
			timeAsInt = 26;
		}
		else if(time.equals( "13:30"))
		{
			timeAsInt = 27;
		}
		else if(time.equals( "14:00"))
		{
			timeAsInt = 28;
		}
		else if(time.equals( "14:30"))
		{
			timeAsInt = 29;
		}
		else if(time.equals( "15:00"))
		{
			timeAsInt = 30;
		}
		else if(time.equals( "15:30"))
		{
			timeAsInt = 31;
		}
		else if(time.equals( "16:00"))
		{
			timeAsInt = 32;
		}
		else if(time.equals( "16:30"))
		{
			timeAsInt = 33;
		}
		else if(time.equals( "17:00"))
		{
			timeAsInt = 34;
		}
		else if(time.equals( "17:30"))
		{
			timeAsInt = 35;
		}
		else if(time.equals( "18:00"))
		{
			timeAsInt = 36;
		}
		else if(time.equals( "18:30"))
		{
			timeAsInt = 37;
		}
		else if(time.equals( "19:00"))
		{
			timeAsInt = 38;
		}
		else if(time.equals( "19:30"))
		{
			timeAsInt = 39;
		}
		else if(time.equals( "20:00"))
		{
			timeAsInt = 40;
		}
		else if(time.equals( "20:30"))
		{
			timeAsInt = 41;
		}
		else if(time.equals( "21:00"))
		{
			timeAsInt = 42;
		}
		else if(time.equals( "21:30"))
		{
			timeAsInt = 43;
		}
		else if(time.equals( "22:00"))
		{
			timeAsInt = 44;
		}
		else if(time.equals("22:30"))
		{
			timeAsInt = 45;
		}
		else if(time.equals("23:00"))
		{
			timeAsInt = 46;
		}
		else if(time.equals("23:30"))
		{
			timeAsInt = 47;
		}
		else
		{
			timeAsInt = 50; //random value that for all other cases that will throw an error if the time isn't one of the above.
		}
		return timeAsInt;
	}

	private static void clearPrint(String text)
	{
		clearScreen();
		System.out.println(text);
	}
	
	private static void clearScreen()
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("\n");
		}
	}
}
