package converge;
import java.io.*;

public class FileRead 
{	
	private static void readEvents()
	{
		//Initialize input stream
	    FileInputStream in = null;
		
		//Navigate to eventlog directory where events are stored as .txt files
		File folder = new File("/eventlog/");
		
		//Create a list of all the files in the directory
		File[] listOfFiles = folder.listFiles();

		//Iterate through files
		for (int i = 0; i < listOfFiles.length; i++) 
		{
		  File file = listOfFiles[i];
		  if (file.isFile() && file.getName().endsWith(".txt")) 
		  {
				//in file object within try catch block
		        try 
		        {
					in = new FileInputStream(file);
				} catch (FileNotFoundException e) 
		        {
					e.printStackTrace();
				}
		        
		        
		        
		  } 
		}
	}
}

