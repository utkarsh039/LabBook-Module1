package lab10;

@FunctionalInterface
interface Accept{

	public boolean check(String usernam,String password);
}
public class Exercise3 {

	public static void main(String[]args) {
		String username="system";
		String password="oracle";
		Accept a=(s1,s2)->{
			if(s1.equals("system") && s2.equals("oracle"));
			return true;
		};
		System.out.println(a.check(username,password));
	}
}
