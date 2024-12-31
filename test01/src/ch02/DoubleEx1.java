package ch02;

public class DoubleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 3.14;
		float fnum =3.14F; //float은 끝에 f 또는 F를 붙여야 함//
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		double dnum1 = 1;
		for(int i = 0; i < 10000; i++) {
			dnum1 = dnum1 + 0.1;
		}
		System.out.println(dnum1); //부동 소수 점은 0을 만들수 없기에 오차가 발생함//
		
		boolean isMarried = true;
		System.out.println(isMarried);

	}

}
