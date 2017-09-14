package converge;
import java.io.IOException;
import java.util.Vector;

public class Main {
	public static void main(String []args) throws IOException
	{
	FileRead fr = new FileRead();
	Vector<Event> events = fr.readEvents();
	}
}
