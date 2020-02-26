package lab6;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		String str2=Exercise3.getImage(str);
		System.out.println("output: "+str2);
	}
	public static String getImage(String str) {
		StringBuffer str1=new StringBuffer();
		String str2="";
		str1.append(str);
		str1.append("|");
		str2=str1.reverse().toString();
		return str.concat(str2);
	}
}
