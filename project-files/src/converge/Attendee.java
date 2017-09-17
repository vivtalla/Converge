package converge;
import java.util.*;

public class Attendee {
	//Declare local variables
	String userName;
	Vector<Integer> availability = new Vector<Integer>();
	
	//Constructor methods
	public Attendee() {}
	public Attendee(String name, Vector<Integer> input)
	{
		userName = name;
		availability = input;
	}
	public String getName()
	{
		return userName;
	}
	public Vector<Integer> getAvailability()
	{
		return availability;
	}
	public void setName(String name)
	{
		userName = name;
	}
}
