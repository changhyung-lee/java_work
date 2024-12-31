package ch03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 2개를 입력받아 평균 70점 이상 "합격", 미만 "불합격"
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력해주세요");
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		String result;
		result = ((score1 + score2) / 2 >= 70) ? "합격" : "불합격";
		//String : " " 한글
		//char : ' ' 한글자(T, F)
		//boolea : true, false
		
		System.out.println(result);
		sc.close();

	}

}
