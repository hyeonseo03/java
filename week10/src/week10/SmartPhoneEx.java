package week10;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone mine = new SmartPhone("갤럭시","white");
		System.out.println("모델 :" + mine.getModel());
		System.out.println("모델 :" + mine.getColor());
		System.out.println("모델 :" + mine.isWifi());
		
		mine.bell();
		mine.sendVoice("Hello");
		mine.receiveVoice("홍길동입니다");
		mine.hangUP();
		
		mine.setWifi(true);
		mine.intrenet();
	}

}
