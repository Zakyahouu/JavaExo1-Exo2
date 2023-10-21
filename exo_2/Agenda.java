package exo_2;
import java.util.*;
import exo_1.Date;
public class Agenda {
	
	private String fullName ;
	private int age ;
	private String occupation ;
	private Vector<Event> events ;
	
	public Agenda(String fullName, int age, String occupation) {
		
		verifyName(fullName);
		this.age = age ;
		this.occupation = occupation;
		events = new Vector<Event>();
	
	}
	
	
	private int verifyName(String fullName)
	{
		Scanner sc = new Scanner(System.in);//declaring the scan to check the input
		while(true)
		{
			if(fullName.trim().isEmpty())
			{	
				System.out.print("Invalid, Give a valid full name :\n");
				if(sc.hasNext())
				{
					fullName = sc.nextLine();
				}else
				{
					System.out.println("No valid input !");
				}
				
			}else
			{
				this.fullName = fullName;
				sc.close();
				break;
			}
			
		}
		return 0;
		
	};
	
	/**
	 * getting the full name of event
	 * @return fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * setting and change the name of the event
	 * @param fullName
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * getting the age of the owner of this agenda
	 * @return Age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * setting the age of the owner of this agenda
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * getting the occupation of the owner of this agenda
	 * @return
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * setting the occupation of the owner of this agenda
	 * @param occupation
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * Adding event into a vector of events , this vector will be sorted according to each 
	 * Event period , if its ahead it will be the first at the vector.
	 * @param e (Event)
	 * @return true if the Event been added successfully
	 * 		   false the otherwise.
	 */
	public boolean addEvent(Event e)
	{
		for(Event i : events)
		{
			if(i.getName() == e.getName())//if There is an Event with the same name,
			{							  //The `Event e` wont be added.
				return false;
			}
		}
		events.add(e);
		Collections.sort(events,new PeriodeCompare());//sorting the vector of Events according to each one's period
		return true;
	}
	
	/**
	 * 
	 * @param target the Event looking for
	 * @return Event Name
	 * 		   "..." if the event doesn't exists 
	 */
	public String searchForEvent(Date target)
	{
		for(Event i : events)
		{
			if(target.compare(i.getStartDate())==0)
			{
				return "this event exists and its name is :"+i.getName();
			}
		}
		return "...";
	}
	
	/**
	 * 
	 */
	public String toString()
	{
		String str = new String() ;
		str = ""+this.fullName +" a "+this.occupation+" Has these events : ";
		for(Event i : events)
		{
			str = str + " "+i.getName()+" in the periode "+ i.getPeriodeOfEvent().toString() + "\n" ;		
		}
		return str; 
	}
	
	
		
}
