
public class drive {
	public static void main (String args[]) {
		Runnable datePrint = new DateTask();
		Runnable datePrint1 = new DateTask();
		
		// Create objects of thread with name
		Thread printerThread = new Thread(datePrint, "printerThread [1]");
		Thread printerThread1 = new Thread(datePrint1, "printerThread [2]");
		
		// Execute thread
		printerThread.start();
		printerThread1.start();
	}
}
