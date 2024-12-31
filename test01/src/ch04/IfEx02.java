package ch04;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점");
		}
		else if(score >= 80) {
			System.out.println("B학점");			
		}
		else if(score >= 70) {
			System.out.println("C학점");
		}
		else
			System.out.println("F학점");

	}

}
