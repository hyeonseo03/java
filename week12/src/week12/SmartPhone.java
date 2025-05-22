package week12;

public class SmartPhone {
	//인터페이스 변수로 속성 (필드) 선언
	EarPhone earPhone;
	
	public void musicOn(EarPhone ep) {
		ep.play();
	}
	
	public void musicOff(EarPhone ep) {
		ep.stop();
	}
}
