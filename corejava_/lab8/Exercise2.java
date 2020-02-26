package lab8;
import java.util.Date;

class Exercise2 implements Runnable{
	
	public void run() {
	while(true) {
	   	try {
	   		Date dat=new Date();
	   		System.out.println(dat);
	   		Thread.sleep(10000);	   	
	   		}catch(InterruptedException e) {
	   		e.printStackTrace();
	   	}
	  }
 }
}
public class Lab8Exercise2 {

	public static void main(String[]args) {
       Exercise2 e2=new Exercise2();
       Thread thread=new Thread(e2);
       thread.start();
	}
}
