package ch02;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수 = -2, -1, 0 , 1, 2 와 같이 소수점이 없는 수
		//실수 = 0.1, 0.2, 0.3 과 같이 소수점이 있는 수
		//정수와 실수를 같이 사용할 수 없으며, 사용이 필요할 시 형 변환을 통해 사용 가능하다.
		byte b = 3;
		int num = b;
		b = (byte)num;
		
		int num1 = (int)(num + 3.5);

		System.out.println(num1);
	}

}
