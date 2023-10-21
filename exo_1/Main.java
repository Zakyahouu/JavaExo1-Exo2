package exo_1;
/**

 * @author Boucetta zakaria
 * @version 2.1
 * This code made for testing a custom Date class inspirede by the original Date class in java
 * (import java.util.Date) also testing the Periode class that represent a periode with start date and end date.
 *
 */

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Date date1 = new Date(1,12,2001);
		Date date2 = new Date(2,2,2003);
		Date date3 = new Date(7,10,-10);
		
		System.out.println(date1.showDifference(date2));
		
		System.out.println(date1.toString());
		System.out.println(date1.fullDisplay());
		System.out.println(date2.toString());
		System.out.println(date2.fullDisplay());
		
		Date date4 = new Date();
		
		System.out.println(date4.toString());
		System.out.println(date4.fullDisplay());
		
		
		Periode p1 = new Periode(date1);
		Periode p2 = new Periode(date1,date2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
