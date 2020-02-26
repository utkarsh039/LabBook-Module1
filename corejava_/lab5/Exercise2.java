package lab5;

import java.util.Scanner;

public class Exercise2 {

	public static int Fibonacci(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		else
			 return (Fibonacci(n-1)+Fibonacci(n-2));
		
	}
	
	public static int IterativeFib(int n) {
		
		int i,z=0;
		int x=1,y=1;
		for(i=1;i<n-1;i++){
	   		z=x+y;
		   x=y;
		   y=z;
		}
		
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=n;
		int fun3=IterativeFib(n);
		System.out.println("Iterative nth value is "+fun3);
		int fib=Fibonacci(c);
		System.out.println("Recursively nth value of fibonacci is "+fib);
		
	}

}
