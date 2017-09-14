package converge;
import java.io.*;
import java.util.*;


public class FileRead
{
	private static Vector<Event> readEvents() throws IOException
	{
		//Declare List of events
		Vector<Event> events = new Vector<Event>();
		
		//Declare input stream
		FileReader in = null;
		
		//Navigate to event log directory where events are stored as .txt files
		File folder = new File("event_log/");
		
		//Create a list of all the files in the directory
		File[] listOfFiles = folder.listFiles();

		//Iterate through files
		for (int i = 0; i < listOfFiles.length; i++) 
		{
		  File file = listOfFiles[i];
		  System.out.println(file.getName());
		  if (file.isFile() && file.getName().endsWith(".txt")) 
		  {
				//in file object within try catch block
		        try 
		        {
					in = new FileReader(file);
				}
		        catch (FileNotFoundException e) 
		        {
					e.printStackTrace();
				}
		        
		        //Take file input as multiple lines in 'record' list
	            BufferedReader bufferedReader = new BufferedReader(in);
		        String line = null;
			  	List<String> records = new ArrayList<String>();

		        //Adds every line to 'record' list
		        while ((line = bufferedReader.readLine()) != null)
		        {
		          records.add(line);
		        }
		        
		        //Assign first value as event name
		        String name = records.get(0);
		        
		        //Assign second value as date
		        String date = records.get(1);
		        String[] splitDate = date.split("\\s+");
		        int month = 	Integer.parseInt(splitDate[0]);
		        int day =	Integer.parseInt(splitDate[1]);
		        int year = 	Integer.parseInt(splitDate[2]);
		        
		        Vector<Integer> adminAvailability = new Vector<Integer>();
		        Vector<Attendee> attendees = new Vector<Attendee>();
		        
		        //Iterate through admin availability and each attendee in file
		        int attendeeIndex = 2;
		        do
		        {
		        		//Index records to find
		        		String temp = records.get(attendeeIndex);
		        		int tempInt = 0;
		        		String[] splitAtt = temp.split("\\s+");
		        		String attendeeName = null;
		        		Vector<Integer> availability = new Vector<Integer>();
		        		
		        		int availabilityIndex = 0;
		        		do
		        		{
			        		try 
			        		{
			        		    tempInt = Integer.parseInt(splitAtt[availabilityIndex]);
			        		    availability.add(tempInt);
			        		} 
			        		catch (NumberFormatException e) 
			        		{
			        			if (attendeeName == null)
			        			{
			        				attendeeName = splitAtt[availabilityIndex];
			        			}
			        			else
			        			{
				        		    attendeeName = attendeeName + " " + splitAtt[availabilityIndex];
			        			}
			        		}
			        		availabilityIndex++;
		        		} while (availabilityIndex < splitAtt.length);
		        		
		        		if (attendeeName == null)
		        		{
		        			adminAvailability = availability;
		        		}
		        		else
		        		{
			        		Attendee a = new Attendee(attendeeName, availability);
			        		attendees.add(a);
		        		}
		        		
		        		attendeeIndex++;
		        		
		        } while(attendeeIndex < records.size());
		        
		        Event e = new Event(name, month, day, year, attendees, adminAvailability);
		        events.add(e);
		  } 
		}
		return events;
	}
}

