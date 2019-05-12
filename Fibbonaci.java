package Tugas1;
import java.util.Scanner;

public class Fibbonaci implements Runnable {

	public void run() {
		Scanner scan = new Scanner(System.in);
	try {
		Thread.sleep(4000);
	}   catch (InterruptedException e) {
		e.printStackTrace();
	}
		System.out.println("Enter:");
			int fibo = scan.nextInt();
			scan.close();
			int number1 = 0, number2 = 1, fibosequence = 0;
	while (fibosequence < fibo ) {
			fibosequence = number1 + number2;
			number1 = number2;
			number2 = fibosequence;
	}
	if (fibo == fibosequence) {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
			System.out.println("The Number is belongs to Fibonacci Sequence");
	} else {
	try {
	Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
			}
			System.out.println("The Number does not belong to Fibonacci Sequence");
		}
	}		
	}

	
	

	
		
	



