package lab6;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1= sc.next();
		String s2 = Exercise4.alterString(s1);
		System.out.println(s1+" is changed as "+s2);
	}

	public static String alterString(String s1) {
		char ch;
		String s2="";
		for (int i=0;i<s1.length();i++) {
			ch = s1.charAt(i);
			if ((ch != 'A') && (ch != 'E') && (ch != 'I') && (ch != 'O') && (ch != 'U') && (ch != 'a') && (ch != 'e')
					&& (ch != 'i') && (ch != 'o') && (ch != 'u')) {
				
				s2+=(char)(ch + 1);

			} else {
				s2+=ch;

			}

		}
		return s2;
	}

}