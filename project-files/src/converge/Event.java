package converge;

import java.util.Vector;

public class Event {
	String a_eventName;
	int a_month;
	int a_day;
	int a_year;
	Vector<Attendee> a_attendees = new Vector<Attendee>();
	Vector<Integer> a_adminAvailability = new Vector<Integer>();
  
	public Event() {}
	public Event(String eventName, int month, int day, int year, Vector attendees, Vector adminAvailability )
	{
		a_eventName = eventName;
		a_month = month;
		a_day = day;
		a_year = year;
		a_attendees = attendees;
		a_adminAvailability = adminAvailability;
		
	}
	public void print()
	{
		System.out.println(a_eventName);
		System.out.println(a_month);
		System.out.println(a_day);
		System.out.println(a_year);
		System.out.println(a_adminAvailability);
		for (int i = 0; i < a_attendees.size(); i++)
		{
			Attendee a = a_attendees.get(i);
			System.out.println(a.getName() + a.getAvailability());
		}
	}
	public void setEventName(String eventName)
	{
		a_eventName = eventName;
	}
	public String getEventName()
	{
		return a_eventName;
	}
	public void setMonth( int month )
	{
		a_month = month;
	}
	public int getMonth()
	{
		return a_month;
	}
	public void setDay(int day)
	{
		a_day = day;
	}
	public int getDay()
	{
		
		return a_day;
	}
	public void setYear(int year)
	{
		a_year = year;
	}
	public int getYear()
	{
		return a_year;
	}
	
	private static void exportEvents()
	{
		
	}
	public void get12HourAvailability() {
		for(int i= 0; i < a_adminAvailability.size(); i++) {
			
			if(a_adminAvailability.elementAt(i) == 0) {
				System.out.print("12:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 1) {
				System.out.print("12:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 2) {
				System.out.print("1:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 3) {
				System.out.print("1:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 4) {
				System.out.print("2:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 5) {
				System.out.print("2:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 6) {
				System.out.print("3:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 7) {
				System.out.print("3:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 8) {
				System.out.print("4:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 9) {
				System.out.print("4:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 10) {
				System.out.print("5:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 11) {
				System.out.print("5:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 12) {
				System.out.print("6:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 13) {
				System.out.print("6:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 14) {
				System.out.print("7:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 15) {
				System.out.print("7:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 16) {
				System.out.print("8:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 17) {
				System.out.print("8:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 18) {
				System.out.print("9:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 19) {
				System.out.print("9:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 20) {
				System.out.print("10:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 21) {
				System.out.print("10:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 22) {
				System.out.print("11:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 23) {
				System.out.print("11:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 24) {
				System.out.print("12:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 25) {
				System.out.print("12:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 26) {
				System.out.print("1:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 27) {
				System.out.print("1:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 28) {
				System.out.print("2:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 29) {
				System.out.print("2:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 30) {
				System.out.print("3:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 31) {
				System.out.print("3:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 32) {
				System.out.print("4:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 33) {
				System.out.print("4:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 34) {
				System.out.print("5:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 35) {
				System.out.print("5:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 36) {
				System.out.print("6:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 37) {
				System.out.print("6:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 38) {
				System.out.print("7:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 39) {
				System.out.print("7:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 40) {
				System.out.print("8:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 41) {
				System.out.print("8:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 42) {
				System.out.print("9:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 43) {
				System.out.print("9:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 44) {
				System.out.print("10:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 45) {
				System.out.print("10:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 46) {
				System.out.print("11:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 47) {
				System.out.print("11:30PM ");
			}
		}
	}
	public void get24HourAvailability() {
		for(int i= 0; i < a_adminAvailability.size(); i++) {
			
			if(a_adminAvailability.elementAt(i) == 0) {
				System.out.print("00:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 1) {
				System.out.print("00:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 2) {
				System.out.print("1:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 3) {
				System.out.print("1:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 4) {
				System.out.print("2:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 5) {
				System.out.print("2:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 6) {
				System.out.print("3:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 7) {
				System.out.print("3:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 8) {
				System.out.print("4:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 9) {
				System.out.print("4:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 10) {
				System.out.print("5:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 11) {
				System.out.print("5:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 12) {
				System.out.print("6:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 13) {
				System.out.print("6:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 14) {
				System.out.print("7:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 15) {
				System.out.print("7:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 16) {
				System.out.print("8:00");
			}
			else if(a_adminAvailability.elementAt(i) == 17) {
				System.out.print("8:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 18) {
				System.out.print("9:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 19) {
				System.out.print("9:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 20) {
				System.out.print("10:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 21) {
				System.out.print("10:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 22) {
				System.out.print("11:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 23) {
				System.out.print("11:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 24) {
				System.out.print("12:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 25) {
				System.out.print("12:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 26) {
				System.out.print("13:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 27) {
				System.out.print("13:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 28) {
				System.out.print("14:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 29) {
				System.out.print("14:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 30) {
				System.out.print("15:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 31) {
				System.out.print("15:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 32) {
				System.out.print("16:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 33) {
				System.out.print("16:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 34) {
				System.out.print("17:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 35) {
				System.out.print("17:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 36) {
				System.out.print("18:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 37) {
				System.out.print("18:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 38) {
				System.out.print("19:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 39) {
				System.out.print("19:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 40) {
				System.out.print("20:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 41) {
				System.out.print("20:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 42) {
				System.out.print("21:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 43) {
				System.out.print("21:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 44) {
				System.out.print("22:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 45) {
				System.out.print("22:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 46) {
				System.out.print("23:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 47) {
				System.out.print("23:30 ");
			}
		}
	}
}
