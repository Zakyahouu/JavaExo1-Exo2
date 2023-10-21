package exo_2;

import java.util.Comparator;



public class PeriodeCompare implements Comparator<Event>{

	@Override
	public int compare(exo_2.Event o1, exo_2.Event o2) {
		
		return o1.getPeriodeOfEvent().avantSecond(o2.getPeriodeOfEvent())*-1;
	}

}
