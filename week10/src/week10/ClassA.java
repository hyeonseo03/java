package week10;

public class ClassA {
	//생서자를 이용해서 객체 생성
	ClassA c1 = new ClassA(true);
	ClassA c2 = new ClassA(10);
	ClassA c3 = new ClassA("문자열");
	
	
	//생성자 오버로딩
	ClassA(int data){
		//접근제한자가 생락되면 default 접근제한자
	}
	
	public ClassA(boolean data) {
		//public 접근제한자는 어디서든 누구나 사용가능
	}
	
	private ClassA(String data) {
		//private 접근제한자는 클래스 안에서만 사용가능
	}
}
