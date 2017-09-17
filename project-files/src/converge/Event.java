package converge;

import java.io.*;
import java.util.*;

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
	public String getAdminName()
	{
		return a_attendees.get(0).getName();
	}
	public void setEventName(String eventName)
	{
		a_eventName = eventName;
	}
	public String getEventName()
	{
		return a_eventName;
	}
	public void setMonth(int month)
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
  
	public void addAttendee(Attendee a)
	{
		a_attendees.add(a);
	}
	private void exportEvents() throws IOException
	{
		//Export file to .event file in /event_log/ directory
		String filename = "event_log/" + a_eventName.replaceAll("\\s+","") + ".event";
		FileWriter writer = new FileWriter(filename);
		
		//Output name and date accordingly
		writer.write(a_eventName + "\n");
		writer.write(a_month + " " + a_day + " " + a_year + "\n");
		
		//Output the admin availability vector
		for (int i = 0; i < a_adminAvailability.size(); i++)
		{
			writer.write(a_adminAvailability.get(i) + " ");
		}
		writer.write("\n");
		
		//Iterate through attendees lines
		for (int i = 0; i < a_attendees.size(); i++)
		{		
			//Output the name and availability of the attendee
			writer.write(a_attendees.get(i).getName() + " ");
			for (int j = 0; j < a_attendees.get(i).getAvailability().size(); j++)
			{
				writer.write(a_attendees.get(i).getAvailability().get(j) + " ");
			}
			writer.write("\n");
		}
		
		//Close FileWriter
		writer.flush();
		writer.close();
    
	public Vector getAvailability()
	{
		return a_adminAvailability;
	}
	public void get12HourAvailability() {
		for(int i= 0; i < a_adminAvailability.size(); i++) {
			
			if(a_adminAvailability.elementAt(i) == 0) {
				System.out.println("12:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 1) {
				System.out.println("12:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 2) {
				System.out.println("1:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 3) {
				System.out.println("1:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 4) {
				System.out.println("2:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 5) {
				System.out.println("2:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 6) {
				System.out.println("3:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 7) {
				System.out.println("3:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 8) {
				System.out.println("4:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 9) {
				System.out.println("4:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 10) {
				System.out.println("5:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 11) {
				System.out.println("5:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 12) {
				System.out.println("6:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 13) {
				System.out.println("6:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 14) {
				System.out.println("7:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 15) {
				System.out.println("7:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 16) {
				System.out.println("8:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 17) {
				System.out.println("8:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 18) {
				System.out.println("9:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 19) {
				System.out.println("9:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 20) {
				System.out.println("10:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 21) {
				System.out.println("10:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 22) {
				System.out.println("11:00AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 23) {
				System.out.println("11:30AM ");
			}
			else if(a_adminAvailability.elementAt(i) == 24) {
				System.out.println("12:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 25) {
				System.out.println("12:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 26) {
				System.out.println("1:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 27) {
				System.out.println("1:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 28) {
				System.out.println("2:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 29) {
				System.out.println("2:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 30) {
				System.out.println("3:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 31) {
				System.out.println("3:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 32) {
				System.out.println("4:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 33) {
				System.out.println("4:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 34) {
				System.out.println("5:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 35) {
				System.out.println("5:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 36) {
				System.out.println("6:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 37) {
				System.out.println("6:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 38) {
				System.out.println("7:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 39) {
				System.out.println("7:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 40) {
				System.out.println("8:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 41) {
				System.out.println("8:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 42) {
				System.out.println("9:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 43) {
				System.out.println("9:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 44) {
				System.out.println("10:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 45) {
				System.out.println("10:30PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 46) {
				System.out.println("11:00PM ");
			}
			else if(a_adminAvailability.elementAt(i) == 47) {
				System.out.println("11:30PM ");
			}
		}
	}
	public void get24HourAvailability() {
		for(int i= 0; i < a_adminAvailability.size(); i++) {
			
			if(a_adminAvailability.elementAt(i) == 0) {
				System.out.println("00:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 1) {
				System.out.println("00:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 2) {
				System.out.println("1:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 3) {
				System.out.println("1:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 4) {
				System.out.println("2:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 5) {
				System.out.println("2:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 6) {
				System.out.println("3:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 7) {
				System.out.println("3:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 8) {
				System.out.println("4:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 9) {
				System.out.println("4:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 10) {
				System.out.println("5:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 11) {
				System.out.println("5:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 12) {
				System.out.println("6:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 13) {
				System.out.println("6:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 14) {
				System.out.println("7:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 15) {
				System.out.println("7:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 16) {
				System.out.println("8:00");
			}
			else if(a_adminAvailability.elementAt(i) == 17) {
				System.out.println("8:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 18) {
				System.out.println("9:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 19) {
				System.out.println("9:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 20) {
				System.out.println("10:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 21) {
				System.out.println("10:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 22) {
				System.out.println("11:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 23) {
				System.out.println("11:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 24) {
				System.out.println("12:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 25) {
				System.out.println("12:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 26) {
				System.out.println("13:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 27) {
				System.out.println("13:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 28) {
				System.out.println("14:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 29) {
				System.out.println("14:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 30) {
				System.out.println("15:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 31) {
				System.out.println("15:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 32) {
				System.out.println("16:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 33) {
				System.out.println("16:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 34) {
				System.out.println("17:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 35) {
				System.out.println("17:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 36) {
				System.out.println("18:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 37) {
				System.out.println("18:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 38) {
				System.out.println("19:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 39) {
				System.out.println("19:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 40) {
				System.out.println("20:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 41) {
				System.out.println("20:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 42) {
				System.out.println("21:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 43) {
				System.out.println("21:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 44) {
				System.out.println("22:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 45) {
				System.out.println("22:30 ");
			}
			else if(a_adminAvailability.elementAt(i) == 46) {
				System.out.println("23:00 ");
			}
			else if(a_adminAvailability.elementAt(i) == 47) {
				System.out.println("23:30 ");
			}
		}
	}
}
