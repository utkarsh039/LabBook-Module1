package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public void getSorted() {
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[3];
		for(Integer i:ar) {
			ar[i]=sc.nextInt();
		}
		String s=Arrays.toString(ar);
		
		System.out.println(s);
	
	}
}
