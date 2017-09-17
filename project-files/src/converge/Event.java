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
	public void exportEvent() throws IOException
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
	}
}
