package ch04;

import java.util.Scanner;

public class IfEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 월 입력 시 계절 출력
		// 봄 3 ~ 5, 여름 6 ~ 8, 가을 9 ~ 11, 겨울 12 ~ 2
		
		Scanner cd = new Scanner(System.in);
		System.out.println("희망하는 월을 입력해주세요(숫자만)");
		
		int month = cd.nextInt();
		
		if (month >= 3 && month <= 5) {
			System.out.println("계절은 봄입니다");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("계절은 여름입니다");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("계절은 가을입니다");
		}
		else if (month == 1 || month == 2 || month == 12) {
			System.out.println("계절은 겨울입니다");
		}
	}

}
