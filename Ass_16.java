package assignment_2;

import java.util.Scanner;

public class Ass_16 {

	public static void main(String[] args) {
		System.out.print("10 미만의 홀수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;

		for(int i = 0; i < n; i++) {
			for(int j = 1 + a; j <= ((2 * n) - 1 + a); j+=2) {
				b+=2;

				if(j > 10) {
					System.out.print((j % 10) + " ");
				} else {
					System.out.print(j + " ");
				}
			}
			a = b;
			System.out.println();
		}
		sc.close();
	}

}
