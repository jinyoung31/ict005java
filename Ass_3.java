package assignment_2;

import java.util.Scanner;

public class Ass_3 {

	public static void main(String[] args) {

		System.out.print("한개의 자연수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(n * (i+1) + " ");
			sc.close();
		}
	}

}
