import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTask implements Runnable{
	public void printDate(String currentThread) {
		for(int i = 0; i < 5; i++) {
			SimpleDateFormat formatter = new SimpleDateFormat("D/MM/YYYY");
		    Date date = new Date();
			System.out.println(currentThread + " -> " + (i + 1) + ". Date is : " + formatter.format(date));
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread currentThread = Thread.currentThread();
		printDate(currentThread.getName());
	}
}
