package ch01;

public class DowhilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
		int sum = 0;
		
		do {
			sum += num;
			num++;
			System.out.println("num=" + num);
			System.out.println("sum=" + sum);
		} while(num <= 10);
		System.out.println("num=" + num);
		System.out.println("sum=" + sum);

	}

}
