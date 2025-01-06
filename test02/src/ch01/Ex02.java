package ch01;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = -10; i <= 10; i++) {
			for(int j = -10; j <= 10; j++) {
				if(Math.abs(j) <= 10-Math.abs(i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	}

}
}	