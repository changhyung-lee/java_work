package ch02;

public class BinaryTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10;
int num1=5;
int bNum=0B1010;
int oNum=012;
int hNum=0XA;
int bNum2=0B00000000000000000000000000000101;
//음수 표기 시 1을 더해줘야 함
int bNum3=0B11111111111111111111111111111011;
int c=num+num1;

System.out.println(bNum2);
System.out.println(bNum3);
System.out.println(bNum2 + bNum3);

//java 주석 방법 = // 또는 ctrl + /, 또는 /* + */ 로 처리 
System.out.println(num);
System.out.println(bNum);
System.out.println(oNum);
System.out.println(hNum);
	}

}
