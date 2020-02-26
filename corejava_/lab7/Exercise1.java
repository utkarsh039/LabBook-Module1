package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashMap;
import java.util.List;


public class Exercise1 {

	static List<String> getValues(HashMap<Integer,String> hashMap){
		Collection<String> list1=hashMap.values();
		List<String> list2=new ArrayList<String>();
		for(String str:list1)
		{
			list2.add(str);
		}
		Collections.sort(list2);
		return list2;
	}
	
	public static void main(String args[]) {
		String ar[]= {"Delhi",,"Rajasthan","Chennai","Mumbai"};
		HashMap<Integer,String> hashMap1=new HashMap<>();
		
		Random rand=new Random();
		for(int i=0;i<ar.length;i++)
			hashMap1.put(rand.nextInt(), ar[i]);
		
		List<String> mL =getValues(hashMap1);
		
		System.out.println(mL);
	}
}
