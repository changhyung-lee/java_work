package ch04_2;

public class SwitchTest_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 15;
		String season;
		
		switch(month) {
		case 3,4,5 : season = "계절은 봄입니다"; break;
		case 6,7,8 : season = "계절은 여름입니다"; break;
		case 9,10,11 : season = "계절은 가을입니다"; break;
		case 12,1,2 : season = "계절은 겨울입니다"; break;
		default : season = "잘못 입력하였습니다";
		}
		System.out.println(season);

	}

}
