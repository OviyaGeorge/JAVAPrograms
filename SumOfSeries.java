package java_day1_task;
import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			}
		System.out.println("Sum of first " + n + " natural numbers is: " + sum);
		}
	}
