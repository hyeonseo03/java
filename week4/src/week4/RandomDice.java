package week4;

public class RandomDice {

	public static void main(String[] args) {
		//램던 함수 사용 : Math.random() => 0.0 ~ 0.99999 사이의 실수값 반환
		double num = Math.random();
		System.out.println("램던 숫자 : " + num);
		
		//주사위 : 1~ 6 사이의 값
		int number = (int)(num *6 + 1);
		System.out.println("주사위 숫자 : " + number);
		
		
		
		
		
	}

}
