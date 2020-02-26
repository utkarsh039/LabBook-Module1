package lab7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise2 {

	static HashMap<Character,Integer> countCharacter(Character ar[]){
		HashMap<Character,Integer>hashMap1=new HashMap();
		
		List<Character> list1=Arrays.asList(ar);
		
		int count=0;
		for(Character ch:list1) {
			count=0;
			count=Collections.frequency(list1,ch);
			hashMap1.put(ch, count);
			
		}
		return hashMap1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character character[]= {'a','b',,'d','f','c','d','e','a'};
		System.out.println(countCharacter(character));
	}

}
