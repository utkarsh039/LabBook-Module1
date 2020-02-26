package lab9;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TimeAss extends Thread{
	@Override
	public void run() {
		while(true) {
		try{
		  Date dat=new Date();
		  System.out.println(dat);
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
public class Lab9EX {

	public static void main(String[]args) {
		ExecutorService services=Executors.newSingleThreadExecutor();
		services.execute(new TimeAss());
	}
 }

