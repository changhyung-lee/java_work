package ch01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int times = 1; times <= 9; times++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}

	}

}
