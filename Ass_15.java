package assignment_2;

import java.util.Scanner;

public class Ass_15 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < d; j++) {
                System.out.print(" ");
            }
            d+=2;

            for(int j = 1 + a; j <= n + a - c; j++) {
                System.out.print(j + " ");
                b++;
            }
            a = b;
            c++;
            System.out.println();
        }
        sc.close();
	}

}
