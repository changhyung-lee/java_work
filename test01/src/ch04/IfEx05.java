package ch04;

import java.util.Scanner;

public class IfEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 음료수의 종류와 잔수를 입력받아 가격을 알려주는 프로그램을 작성 //
		Scanner od = new Scanner(System.in);
		
		System.out.println("원하는 음료를 입력해주세요");
		System.out.println("(1:에스프레소, 2:아메리카노, 3:카푸치노, 4: 카페라떼)");
		int order = od.nextInt();
		
		System.out.println("잔의 수를 입력해주세요");
		int cup = od.nextInt();
		
		int charge = 0;
		if (order == 1) {
			System.out.println("에스프레소 :");
			charge = 2000 * cup;
		}
		else if (order == 2) {
			System.out.println("아메리카노 :");
			charge = 2500 * cup;
		}
		else if (order == 3) {
			System.out.println("카푸치노 :");
			charge = 3000 * cup;
		}
		else if (order == 4) {
			System.out.println("카페라떼 :");
			charge = 3500 * cup;
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}
		System.out.println("금액은" + charge + "입니다.");

	}

}
