package converge;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRead
{	
	public static void main(String[] args) throws IOException
	{
		readEvents();
	}
	
	private static List<Event> readEvents() throws IOException
	{
		//Declare List of events
		List<Event> events;
		
		//Declare input stream
		FileReader in = null;
		
		//Navigate to event log directory where events are stored as .txt files
		File folder = new File("event_log/");
		
		//Create a list of all the files in the directory
		File[] listOfFiles = folder.listFiles();
	  	List<String> records = new ArrayList<String>();

		//Iterate through files
		for (int i = 0; i < listOfFiles.length; i++) 
		{
		  File file = listOfFiles[i];
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
		        String line;
		        
		        while ((line = bufferedReader.readLine()) != null)
		        {
		          records.add(line);
		        }
		        
		        Event e;
		        System.out.println(records.get(1));
		        
		        e.
		        
		  } 
		}
		System.out.println(records);
	}
}

