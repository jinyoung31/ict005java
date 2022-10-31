package assignment_2;

import java.util.Scanner;

public class Ass_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("base = ");
			float base = sc.nextFloat();
			
			System.out.print("Height = ");
			float height = sc.nextFloat();
			float width = (base*height)/2;
			
			System.out.println(String.format("triangle width = %.1f", width));
			System.out.print("Continue? ");
			sc.nextLine();
			
			String con = sc.nextLine();
			if(!con.equals(" Y ") && !con.equals("y")) {
				break;
			}
		}
		sc.close();
	}
}
