package Tugas2;
import java.util.Scanner;

public class Demo2 {

	public Demo2() {
	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int fibonacci = scan.nextInt();scan.nextLine();
		Fibonaci2 fibo = new Fibonaci2 (fibonacci);
		Thread thread1 = new Thread(fibo);
		OddorEven2 oddeven = new OddorEven2(fibonacci);
		Thread thread2 = new Thread(oddeven);
		thread1.start();
		thread2.start();
	}

	public static void main(String[] args) {
		new Demo2();
	}

}

