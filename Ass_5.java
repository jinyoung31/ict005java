package assignment_2;

import java.util.Scanner;

public class Ass_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = 0;

		while(true) {
			int n = sc.nextInt();

			if(n % 3 != 0 && n % 5 !=0) {
				c++;
			}
			else if(n == 0) break;
		}
		System.out.print(c);

		sc.close();
	}
}
