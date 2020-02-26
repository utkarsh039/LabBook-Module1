package lab7;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Exercise6 {

	static List<Integer> voterList(HashMap<Integer, LocalDate> hashMap){
		Set<Integer> set1=hashMap1.keySet();
		
		/*list is been created*/
		List<Integer> list1=new ArrayList<Integer>();
		LocalDate localDate=null;
		LocalDate date=LocalDate.now();
		
		for(Integer i:set1) {
			localDate=hashMap1.get(i);
			
			int year=Period.between(localDate, date).getYears();
			
			if(year>=18)
				list1.add(i);
		}
		return list1;
		
	}
	public static void main(String[] args) {
		

		HashMap<Integer,LocalDate> hashMap2=new HashMap<>();
		
		hashMap2.put(1001,LocalDate.of(2000, 1, 11));
		hashMap2.put(1002,LocalDate.of(2003, 5, 5));
		hashMap2.put(1031,LocalDate.of(2015, 8, 2));
		hashMap2.put(1003,LocalDate.of(2012, 4, 10));
		
		System.out.println(voterList(hashMap2));
		
		
		
	}

}
