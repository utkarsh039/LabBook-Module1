package lab10;

import java.util.Scanner;

public class Exercise1 {

	interface funcInterface{
		double operation(int x,int y);
	}
	
	private double operate(int x,int y, funcInterface o) {
		return o.operation(x,y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funcInterface power=(int x,int y)->Math.pow(x,y);
		Exercise1 tobj=new Exercise1();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y");
		int x=sc.nextInt();
		sc.nextLine();
		int y=sc.nextInt();
		
		System.out.println(o.operate(x, y,power));
	}

}
