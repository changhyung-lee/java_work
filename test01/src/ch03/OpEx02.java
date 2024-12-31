package ch03;

import java.util.Scanner;

public class OpEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		System.out.println(score1 >= 70 && score2 >= 70); // &&은 and
		System.out.println(score1 >= 70 || score2 >= 70); // ||은 or
		System.out.println(!(score1 >= 70 && score2 >= 70)); // !()은 반대
		
		sc.close();

	}

}
