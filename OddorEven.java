package Tugas1;
import java.util.Scanner;

public class OddorEven implements Runnable{
	
	Scanner scan = new Scanner(System.in);
	int oddevennumber;

	@Override
	public void run() {
			System.out.println("Enter:");
			oddevennumber= scan.nextInt(); scan.nextLine();
		if(oddevennumber % 2 == 0){
		try {
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
			System.out.println("Odd Number");
		}else{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("Even Number");
		}		
	}
}


