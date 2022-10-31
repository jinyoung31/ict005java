package assignment_2;

import java.util.Scanner;

public class Ass_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("수를 입력하시오: ");
		int b = sc.nextInt();

		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
			
			sc.close();
		}
	}
}
