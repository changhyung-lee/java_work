package ch04;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
				
//		if (score1 > score2 && score1 > score3) {
//			System.out.println(score1);
//		}
//		else if (score2 > score1 && score2 > score3) {
//			System.out.println(score2);
//		}
//		else if (score3 > score1 && score3 > score2) {
//			System.out.println(score3);
//		}
		
		if (score1 > score2) {
			if (score1 > score3) {
				System.out.println("가장 큰 수는" + score1 + "입니다.");
			}
			else {
				System.out.println("가장 큰 수는" + score3 + "입니다.");
			}
		}
		else {
			if (score2 > score3) {
				System.out.println("가장 큰 수는" + score2 + "입니다.");
			}
			else {
				System.out.println("가장 큰 수는" + score3 + "입니다.");
			}
		}
	}

}
