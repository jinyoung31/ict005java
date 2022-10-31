package assignment_2;

import java.util.Scanner;

public class Ass_1 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 100이하의 정수의 합 구하기 ");
		System.out.print(" n의 값을 입력하시오: ");
		int n = sc.nextInt();
		
		if(0 > n || 100 < n) {
			System.out.println(" 종료");
		} else {
		
		while( i <= n) {
			sum += i;
			i++;
			
			if(0 > n || 100 < n) break; 
		}
		
		System.out.println(" 총합: " + sum);
		}
		sc.close();
	}
}


