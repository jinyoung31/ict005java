package assignment_2;

import java.util.Scanner;

public class Ass_3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int sum1 = 0;
		double sum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (i % 2 == 0)
				sum2 += arr[i];

			else
				sum1 += arr[i];
		}

		System.out.println("sum : "+sum1);
		System.out.printf("avg : %.1f",sum2/5);

		sc.close();
	}

}
