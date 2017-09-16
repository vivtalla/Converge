package converge;

import java.util.Scanner;
import java.util.Vector;

public class AddEvent{
	
	public String twelveHourConversion(int i)
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
	public String twentyFourHourConversion(int i)
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
	int choice;
	Vector<Integer> timeVec = new Vector<Integer>() ;{
	for (int i = 0; i < 48; i++)
	{
		timeVec.addElement(i);
	}
	Event newEvent = new Event();
	
	Scanner userInput = new Scanner(System.in); //allows for user input
	
	System.out.println("Enter the name of the event: ");
	
	newEvent.setEventName(userInput.next());
	
	System.out.println("Enter the year of the event as an integer: ");
	newEvent.setYear(userInput.nextInt());
	
	System.out.println("Enter the Month of the event as an integer: ");
	
	newEvent.setMonth(userInput.nextInt());
	
	System.out.println("Enter the Day of the event as an integer: ");
	
	newEvent.setDay(userInput.nextInt());
	
	System.out.println("Would you like the time to be displayed in 12 hour or 24 hour mode?\n");
	System.out.println("Enter 12 for 12 hour mode or 24 for 24 hour mode\n");
	System.out.println("Choice: ");
	choice = userInput.nextInt();
	if (choice == 12)
	{
		for (int i=0; i<48; i++)
		{
			System.out.println(twelveHourConversion(timeVec.get(i)));
			System.out.println(" ");
		}
	}
	else if (choice == 24)
	{
		for (int i=0; i<48; i++)
		{
		System.out.println(twentyFourHourConversion(timeVec.get(i)));
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

