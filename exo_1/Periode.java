package exo_1;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * The Periode class represents a time period between two dates. 
 * It provides methods to create and manipulate date periods and to determine whether one period occurs before another.
 * 
 * This class includes two constructors: one for creating a period with specified start and end dates,
 * and another for creating a period starting from a specified date and ending with the current date.
 * It also provides methods for comparing periods and generating a string representation of the period.
 * @author Boucetta Zakaria 
 * @version 1.8
 */
public class Periode {
	private Date startDate;// The start date of the period.
	private Date finishDate;	// The end date of the period.
	
	public Date getStartDate() {
		return startDate;
	}

	public Date getDate_fin() {
		return finishDate;
	}
	
	/**
     * Constructs a Periode object with specified start and end dates.
     * The constructor automatically orders the dates to ensure the start date is before the end date
     * by if condition using the method Date.compare that returns : 
     *  -1 if date1 is preveous to date 2 ;
     *   1 if date1 is ahead of date 2 ; 
     *   0 if date 1 is equal to date 2 .
     *
     * @param date1 The first date.
     * @param date2 The second date.
     */
	public Periode(Date date1 , Date date2)
	{
		int result = date1.compare(date2);
		if(result == -1)
		{
			this.startDate = date1;
			this.finishDate = date2;
		}else
		{
			this.startDate = date2;
			this.finishDate = date1;
		}
		
	};
	
	public Periode(Date date)
	{	//Calendar today = new GregorianCalendar();
		//Date current = new exo_1.Date(today.get(Calendar.DAY_OF_MONTH), today.get(Calendar.MONTH)+1, today.get(Calendar.YEAR));
		System.out.println("Give today's Date: ");
		Date current = new exo_1.Date();
		int result = date.compare(current);
		
		if(result == -1)
		{
			this.startDate = date;
			this.finishDate = current;
		}else
		{
			this.startDate = current;
			this.finishDate = date;
		}
	}
	
	/**
     * Checks if the current Periode occurs before another given `Periode`.
     *
     * @param p The Periode to compare to.
     * @return true if the current Periode occurs before p, false otherwise.
     */
	
	public boolean avant(Periode p)
	{
		if(this.startDate.compare(p.getStartDate())==1)
		{
			return false;
		}else
		{
			return true;
		}
	}
	
	/**
     * Compares the current Periode with another given Periode.
     *
     * @param p The Periode to compare to.
     * @return -1 if the current Periode occurs before p, 1 if it occurs after, or 0 if they are the same.
     */
	
	public int avantSecond(Periode p)
	{
		if(this.startDate.compare(p.getStartDate())==1)
		{
			return -1;
		}else
		{
			return 1;
		}
	}
	
	/**
     * Generates a string representation of the Periode showing the start and end dates.
     *
     * @return A string representation of the Periode.
     */
	
	public String toString()
	{
		return "From "+this.startDate.toString()+" to "+this.finishDate.toString();
}
	
}
