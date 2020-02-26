package lab1;

public class Exercise1 {
	public int sum(int n) {
		int s=0;
		for(int i=1;i<=n;i++) {
			if(i%3!=0 && i%5!=0)
				s+=i;
		}
		return (n*(n+1)/2)-s;
		
	}
	public static void main(String[] args) {
		Exercise1 e1= new Exercise1();
		System.out.println("required sum is "+e1.sum(10));
	}
}

