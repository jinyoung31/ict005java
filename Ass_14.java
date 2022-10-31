package assignment_2;

import java.util.Scanner;

public class Ass_14 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = n - 1;

		for(int i = 0; i < n; i++){

			for(int j = (2*(n) - 2) - a; j >= 1; j-=1) {
				System.out.print(" ");
			}

			for(int j = 1; j <= n - b; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

			b--;
			a+=2;
		}
		sc.close();
	}

}
