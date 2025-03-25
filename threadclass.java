package javaday5prgms;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}
public class threadclass {
	public static void main(String[]args) {
		MyThread thread1 = new MyThread();  //creating a thread by extending thread class
		thread1.start();                   //to start thread
	}
}
