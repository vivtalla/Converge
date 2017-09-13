package converge;
import java.io.File;

public class FileRead {

	
	private static void readEvents()
	{
		File folder = new File("/eventlog");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  File file = listOfFiles[i];
		  if (file.isFile() && file.getName().endsWith(".txt")) {
		    String content = FileUtils.readFileToString(file);
		    /* do something with content */
		  } 
		}
	}
}

