package exo_1;
import java.util.Scanner;
/**
* The Date class represents a replica of java.util.Date class. It allows for the storage
* and manipulation of dates, including validation of year, month, and day inputs (By user), comparison
* with other dates, and calculation of the difference between dates./n
* 
* This class provides methods :
* 1-to set and get the day, month, and year of a date.
* 2-compare dates, by returning a value (int) represnt the result obtained.
* 3-calculate the difference between two dates and return the diffrence as a String.
* @author Boucetta Zakaria 
* @version 1.8
*/

public class Date{
	
	
	private int year;//The year of the date , note its value should arrange between 0 and 9999 ( psq hkda ana baghi :) )
	private int month;//the month of the Date , note its value should arrange between 1 and 12
	private int day;//The day of the Date , note its value should arrange between 1 and the result 
					//of the function getMaxDayOfMonth.
	/**Day getter
	 * @return Day of the Date
	 */
	public int getDay() {
		return day;
	}
	/**Day setter
	 * @param day to set the Date day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**Month getter
	 * @return month of the Date
	 */
	public int getMonth() {
		return month;
	}
	/**Month setter
	 * @param month to set the Date month
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**Year getter
	 * @return year of the Date
	 */
	public int getYear() {
		return year;
	}
	/**Year setter
	 * @param year to set the Date year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	
	/**
	 * Constructor for the Date class that require params.
	 * This constructor initializes a Date object with the specified day, month, and year values.
	 * @param day   The day of the month (1-31).
	 * @param month The month of the year (1-12).
	 * @param year  The year (0-9999).
	 */
	public Date(int day, int month, int year)
	{		
		/*Scanner scanner = new Scanner(System.in) ;
			while(true) {
				if(year < 0 || year >9999)
				{
					System.out.println("Invalid Year , Give A Year between 0 and 9999 :");
					year = test();
					
				}else
				{
					this.year = year ;
					break;
				}
			}
				
			while(true) {
				if(month <= 0 || month > 12)
				{
					System.out.println("Invalid Month , Give A Month between 1 and 12 :");
					month = scanner.nextInt();
					
				}else
				{
					this.month = month ;
					break;
				}
			}
			
			while(true) {
				if(day <= 0 || day > getMaxDayOfMonth(month , year))
				{
					System.out.println("Invalid Day , Give A Day between 1 and " + getMaxDayOfMonth(month , year)+":");
					day = scanner.nextInt();
					
				}else
				{
					this.day = day ;
					break;
				}
			}*/
				this.day = day;
				this.month = month;
				this.year = year;
				//test(day,month,year);
				//it wont scan or use any method with scan in it inside the constructor ????????||||||| 
		//scanner.close();
		
	}
		
	
	/**
	 * Constructor for the Date class that doesn't require params but set by user input .
	 * Contains a call for function validateAndSetDate.
	 */
	public Date() {
		validateAndSetDate();
	}
	
	/**
	 * This function initializes the Date object params with the specified day, month, and year values set by the user.
	 * It also validates the input to ensure it represents a valid date according to params strains
	 * If the input is invalid, the constructor will prompt the user for correct values.
	 */
	private void validateAndSetDate()
	{		
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter year (0-9999): ");
            int yearInput = scanner.nextInt();

            if (yearInput >= 0 && yearInput <= 9999) {
                this.year = yearInput;
                break;
            } else {
                System.out.println("Invalid Year. Please enter a year between 0 and 9999.");
            }
        }

        while (true) {
            System.out.print("Enter month (1-12): ");
            int monthInput = scanner.nextInt();

            if (monthInput >= 1 && monthInput <= 12) {
                this.month = monthInput;
                break;
            } else {
                System.out.println("Invalid Month. Please enter a month between 1 and 12.");
            }
        }

        while (true) {
            int maxDayOfMonth = getMaxDayOfMonth(month, year);
            System.out.print("Enter day (1-" + maxDayOfMonth + "): ");
            int dayInput = scanner.nextInt();

            if (dayInput >= 1 && dayInput <= maxDayOfMonth) {
                this.day = dayInput;
                break;
            } else {
                System.out.println("Invalid Day. Please enter a day between 1 and " + maxDayOfMonth + ".");
            }
        }
	}
	
	/**
	 * @param month
	 * @param year
	 * @return how many days in the param month.
	 */
	public int getMaxDayOfMonth(int month , int year)
	{	
		if(month == 2 && isLeapYear(year))
		{
			return 29;
		}
		int daysOfEachMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return daysOfEachMonth[month-1];
	}
		/**
		 * 
		 * @param year
		 * @return if the year it is leap (true) or not (false).
		 * this helps identify how many days are in the month 2 (28 or 29)
		 */
	private boolean isLeapYear(int year)
	{
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	
	/**
	 * 
	 * @param autreDate
	 * @return -1 if the param is ahead of the date
	 * 			1 if the param is previous to the date
	 * 			0 if param and the date are equals
	 */
	public int compare(Date autreDate)
	{	
		
		
		if (this.year < autreDate.year) {
            return -1;
        } else if (this.year > autreDate.year) {
            return 1;
        } else {
            // Years are equal, so compare months
            if (this.month < autreDate.month) {
                return -1;
            } else if (this.month > autreDate.month) {
                return 1;
            } else {
                // Months are equal, so compare days
                if (this.day < autreDate.day) {
                    return -1;
                } else if (this.day > autreDate.day) {
                    return 1;
                } else {
                    return 0; // Dates are equal
                }
            }
        }
		
	}
	
	
	/**
	 * 
	 * @param autreDate
	 * @return String that contains the diffrence between autreDate and this.Date in years , months , days.
	 */
	public String showDifference(Date autreDate)
	{	//calculating the diffrences
		int DiffreneceInDays = this.day - autreDate.getDay(),
			DiffreneceInMonths = this.month - autreDate.getMonth(),
			DiffreneceInYears = this.year - autreDate.getYear();
		
		DiffreneceInDays = ( DiffreneceInDays < 0 ) ? DiffreneceInDays*-1 : DiffreneceInDays;
		DiffreneceInMonths = ( DiffreneceInMonths < 0 ) ? DiffreneceInMonths*-1 : DiffreneceInMonths;
		DiffreneceInYears = ( DiffreneceInYears < 0 ) ? DiffreneceInYears*-1 : DiffreneceInYears;
		
		String temp = +DiffreneceInYears+" Years, "+DiffreneceInMonths+" Months and "+DiffreneceInDays+" Days.";
		String str = "Diffrenece between dates "+this.toString()+" and "+autreDate.toString()+" is "+temp;
		
		return str ;
	}
	
	
	
	
	/**
	 * @return String contains this.Date year , month , day in this form :XX/XX/XXXX.
	 */
	public String toString()
	{	String temp1 = new String() ;
	    String temp2 = new String() ;
	    temp1 = "";
	    temp2 = "";
		if(this.day < 10)
		{
		temp1="0";//adding 0 before the day number ,example :01/12/1999;
	 	}
		if(this.month < 10)
		{
			temp2="0";//adding 0 before the month number, example :29/01/2000;
		}
		return temp1+this.day+"/"+temp2+this.month+"/"+this.year;
				
	}
	public String fullDisplay()
	{
		String months[] = {"January","February","March","April","May","June","July","August","September","October","Novermber","December"};
		String temp = "";
		temp = temp +this.day;
		if(this.day == 1)
		{
			temp = temp +"st";
		}
		if(this.day == 2)
		{
			temp = temp +"nd";
		}
		if(this.day == 3)
		{
			temp = temp +"rd";
		}
		if(this.day > 3)
		{
			temp = temp +"th";
		}
		return "The Date is "+temp+" of "+months[this.month-1]+", "+this.year;
	}

}
