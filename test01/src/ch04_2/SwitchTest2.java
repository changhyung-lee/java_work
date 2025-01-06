package ch04_2;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//범위가 들어가는 조건은 if / else if 를 사용해야 함
		//switch 문은 지정 값 외 default 값으로 인식함
		int score = 85;
		char grad;
		
		switch(score) { //굳이 switch를 사용해야 하면, 정수갑이 아닌 실수로 나우어 범위를 정함 ex) score/10 //
		case 90 : grad = 'A'; break;
		case 80 : grad = 'B'; break;
		case 70 : grad = 'C'; break;
		default : grad = 'F';
		}
		
//		if(score >= 90) {
//			grad = 'A';
//		}
//		else if(score >= 80) {
//			grad = 'B';
//		}
//		else if(score >= 70) {
//			grad = 'C';
//		}
//		else {
//			grad = 'F';
//		}
		System.out.println(grad);

	}

}
