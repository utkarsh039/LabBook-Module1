package lab5;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String args[]) {
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			count=0;
			for(int j=1;j<n;j++) {
				if(i%j==0)
					count++;
			}
			
			if(count<=2)
				System.out.println(i);
		}
		
	}
}
