package assignment_2;

import java.util.Scanner;

public class Ass_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int n = sc.nextInt();

		for(int i = n; i <= 100; i+=n) {
			System.out.print(i + " ");

			if(i == 10 || i == 20 || i == 30 || i == 40 || i == 50 
					|| i == 60 || i == 70 || i == 80 || i == 90 || i == 100) {
				break;
			}
		}
		sc.close();
	}
}
