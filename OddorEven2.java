package Tugas2;

public class OddorEven2 implements Runnable {

	String Input;  
	
	public OddorEven2 (int number) {
		if(number%2==1) Input="Odd";
		else Input="Even";
	}

	@Override
	public void run() {

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}

}
