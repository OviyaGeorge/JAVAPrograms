package java_day1_task;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = s.nextInt(); 
		int first = 0, second = 1;
		System.out.print("Fibonacci Series: " + first + ", " + second);
		for (int i = 2; i < n; i++) {
			int next = first + second;
			System.out.print(", " + next);
			first = second; 
			second = next; 
			}
		}
	}
