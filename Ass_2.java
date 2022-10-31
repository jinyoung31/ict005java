package assignment_2;

import java.util.Scanner;

public class Ass_2 {

	public static void main(String[] args) {

		int sum=0;
		int i=0;

		System.out.print("100 이하의 정수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();

		do {
			sum = sum + i;
			++i;
				

		} while (i < 101);
		System.out.print("총합계: " + sum);
		sc.close();
	}
	
}

