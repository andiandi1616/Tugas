package Tugas1;

public class Demo {
	
	public static void main(String[] args) {	
		Thread myThread1 = new Thread
		(new OddorEven());
		Thread myThread2 = new Thread
		(new Fibbonaci());
		
		myThread1.start();
		myThread2.start();
		}
		
}

	

