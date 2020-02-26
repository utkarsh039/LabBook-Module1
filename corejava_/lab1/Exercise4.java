package lab1;

public class Exercise4 {
	public boolean checkNumber(int n) {
		int i=0;
		while(true) {
			double n1=Math.pow(i, 2);
			int n2=(int)n1;
			if(n<n2)
				i+=1;
			if(n==n2)
				return true;
			if(n>n2)
				return false;		
		}
		
		
	}
	public static void main(String[] args) {
		Exercise4 e4= new Exercise4();
		if(e4.checkNumber(113)==true)
			System.out.println("Power of 2");
		else
			System.out.println("Not power of 2");
		
		
	}
}
