package assignment_2;

import java.util.Scanner;

public class Ass_8 {

	public static void main(String[] args) {
		
		System.out.print("자연수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c =0, sum=0;
		
		
		for(int i=1; sum<n; i++) {
			if (i%2==1) {
				sum+=i;
				c++;
			}
		}
		System.out.printf(" %d, %d", c, sum); 
		
		sc.close();
	}

}
