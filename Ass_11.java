package assignment_2;

import java.util.Scanner;

public class Ass_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int n=sc.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			sc.close();
		}
	}

}
