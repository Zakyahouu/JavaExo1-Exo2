package exo_2;
import java.util.Scanner;

import exo_1.Date;
import exo_1.Periode;
public class Main {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		Event e = new Event("",new Date(8,10,2023),new Date(10,10,2023));
		Agenda A1 = new Agenda("", 22, "Front-End devoloper");
		
		//A1.addEvent(new Event("",new Date(8,10,2023),new Date(10,10,2023)));
		//A1.addEvent(new Event("Personal meetings",new Date(15,10,2023),new Date(30,10,2023)));
		//A1.addEvent(new Event("summer events",new Date(15,8,2023),new Date(30,8,2023)));
		
		//System.out.println(A1.toString());
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		
		
	}

}
