package exo_2;
import java.util.*;

import exo_1.Date;
import exo_1.Periode;
/**
 * The Event class represent a collection of event name , start and finish date , and the period of that event.
 * Also provide methods allows to set and get the event name , star & finish date and the period
 * This class will be used in the Class Agenda.
 * @author Boucetta Zakaria
 * @version 2.9
 *
 */
public class Event {

	private String eventName;//The full name of event , doesnt accept NULL name.
	private Date startDate;//The start Date of the event.
	private Date finishDate;//The finish Date of the event.
	private Periode periodeOfEvent;//The periode of Event decided by the start and finish Date.
	
	
	/**
	 * Constructor that setts the params of the class with applying input control on the params
	 * @param name present the Event name 
	 * @param Date1 first input Date
	 * @param Date2 second input Date
	 */
	
	public Event(String name, Date Date1, Date Date2) {
		
		verifyName(name);
		if(Date1.compare(Date2) == -1)
		{
			this.startDate = Date1;
			this.finishDate = Date2;
		}else
		{
			if(Date1.compare(Date2) == 1)
			{
				this.startDate = Date2;
				this.finishDate = Date1;
			}else
			{
				System.out.println("Error The Periode is NULL !!! \n"
						+ " Change manually one of the dates and Periode ||");
			}
		}
		this.periodeOfEvent = new Periode(this.startDate,this.finishDate);
	}
	
	private int verifyName(String name)
	{
		Scanner sc = new Scanner(System.in);//declaring the scan to check the input
		while(true)
		{
			if(name.equals(""))
			{	
				System.out.print("Invalid, Give a valid Event name :\n");
				
					name = sc.next();
					
			}else
			{
				this.eventName = name;
				sc.close();
				break;
			}
			
		}

		return 0;
	}
	
	/**
	 * getter of the event Name
	 * @return event Name
	 */
	public String getName() {
		return eventName;
	}
	/**
	 * setting the event name
	 * @param name
	 */
	public void setName(String name) {
		this.eventName = name;
	}
	/**
	 * getting start date
	 * @return Start Date as object
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * setting the start Date
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * getting the finish Date
	 * @return finish Date
	 */
	public Date getFinishDate() {
		return finishDate;
	}
	/**
	 * setting finish Date
	 * @param finishDate
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	/**
	 * getting the period of event as object
	 * @return period
	 */
	public Periode getPeriodeOfEvent() {
		return periodeOfEvent;
	}
	/**
	 * setting the period of event
	 * @param periodeOfEvent
	 */
	public void setPeriodeOfEvent(Periode periodeOfEvent) {
		this.periodeOfEvent = periodeOfEvent;
	}
	
	
	
	
	
	
}
