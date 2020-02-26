package lab1;

public class Exercise3 {
public boolean checkNumber(int n) {
		int a=n%10;
		while(n!=0) {
			
			n=n/10;
			int b=n%10;
			if(b>a)
				return false;
			a=b;
		}
		return true;
		
		
	}
	public static void main(String[] args) {
		Exercise3 e3= new Exercise3();
		if(e3.checkNumber(113)==true)
			System.out.println("Increasing number");
		else
			System.out.println("Not increasing number");
		
		
	}
}
