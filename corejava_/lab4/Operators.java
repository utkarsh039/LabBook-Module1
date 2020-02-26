package lab4;

import java.util.Scanner;

public class Operators {

	public static int CubeSum(int n) {
		int res,s=0;
		while(n!=0) {
			res=n%10;
			s=s+(res*res*res);
			n=n/10;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=CubeSum(n);
		System.out.println(result);
	}
}
