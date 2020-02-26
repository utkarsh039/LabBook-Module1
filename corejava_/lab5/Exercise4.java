package lab5;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name is");
		String fN=sc.nextLine();
		System.out.println("Last Name is");
		String lN=sc.nextLine();
		try {
			if(fN.isEmpty() || lN.isEmpty()) {
				throw new NullPointerException();
			   }
			else
				System.out.println(fN+" "+lN);
		}catch(NullPointerException e) {
			System.out.println("First and Last name should not be empty");
		}
		
	  }
}
