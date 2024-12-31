package ch02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영문 소문자를 입력해주세요");
		String s = sc.next();
		char ch = s.charAt(0);
		
		System.out.println((char)(ch-32));
				
				
				
				
			

	}

}
