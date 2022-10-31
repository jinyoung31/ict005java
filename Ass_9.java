package assignment_2;

import java.util.Scanner;

public class Ass_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("수를 입력하시오: ");
		int b = sc.nextInt();

		if(a > b) {
			for(int i = 1; i < 10; i++) {
				for(int j = a; j >= b; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j*i);
				}
				System.out.println();
			}
		} else {
			for(int i = 1; i < 10; i++) {
				for(int j = a; j <= b; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j*i);
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
