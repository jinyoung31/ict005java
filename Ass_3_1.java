package assignment_2;

import java.util.Scanner;

public class Ass_3_1 {

	public static void main(String[] args) {
		System.out.print("10개의 대문자 알파벳을 작성하시오: ");
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] arr =  input.split(" ");

		System.out.print(arr[0]+" "+ arr[3] + " " + arr[6]);
		
		sc.close();
	}

}
