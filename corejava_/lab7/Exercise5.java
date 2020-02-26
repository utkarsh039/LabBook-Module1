package lab7;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {

	static Integer getSecondSmallestElement(int ar[]) {
		
		ArrayList<Integer> array=new ArrayList<>();
		for(int i=0;i<ar.length;i++)
		array.add(ar[i]);
		
		Collections.sort(array);
		return array.get(1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int ar[]= {10,23,51,6,44};
      int result=getSecondSmallestElement(ar);
      System.out.println(result);
      
}
}
