package ch04_2;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int rank = 3;
//		char color;
//		switch(rank) {
//		case 1 : color = 'G';
//				break;
//		case 2 : color = 'S';
//				break;
//		case 3 : color = 'B';
//				break;
//		default : color = 'A';
//		}
//		System.out.println(color);

		int rank = 2;
		char color;
		if(rank == 1) {
			color = 'G';
		}
		else if(rank == 2) {
			color = 'S';
		}
		else if(rank == 3) {
			color = 'B';
		}
		else {
			color = 'A';
		}
		System.out.println(color);
	}

}
