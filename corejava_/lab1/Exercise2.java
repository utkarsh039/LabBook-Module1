package lab1;

public class Exercise2 {
	public int calculatedifference(int n) {
		
		
		return ((n*(n+1)*(2*n+1))/6)-((n*(n+1))/2)*((n*(n+1))/2);
		
	}
	public static void main(String[] args) {
		Exercise2 e2= new Exercise2();
		System.out.println("required sum is "+e2.calculatedifference(10));
	}
}

