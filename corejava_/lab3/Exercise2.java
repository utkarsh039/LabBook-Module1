package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public String getSorted(String str) {
		
		char ar[]=str.toCharArray();
		Arrays.sort(ar);
		return new String(ar);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Exercise2 object=new Exercise2();
               Scanner sc=new Scanner(System.in);
               String s=sc.next();
               String result1="",result2="";
               String result=object.getSorted(s);
               for(int i=0;i<result.length()/2;i++) {
            	   result1=result.toUpperCase();
               }
               for(int j=result.length()/2+1;j<result.length();j++) {
            	  result2=result.toLowerCase(); 
               }
               System.out.println(result1+""+result2);
	}

}
