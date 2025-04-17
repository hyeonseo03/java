package week7;

public class CarEx {
	public static void main(String[] args) {
		// 실행 클래스
		//객체 생성
		Car mycar = new Car();
		
		//필드값 출력
		//객체의 필드값은 반드시 객체이름으로 접근해야 함
		System.out.println("제작회사 "+mycar.company);
		System.out.println("모델 "+mycar.model);
		System.out.println("생 상 "+mycar.color);
		System.out.println("최소속도 "+mycar.maxspeed);
		System.out.println("현재 속도 "+mycar.speed);
		
		//필드 값 변경
		mycar.speed = 100;
		System.out.println("현재 속도 "+mycar.speed);
		
		Car yourcar = new Car();
		System.out.println("---yourcar---");
		System.out.println("제작회사 "+yourcar.company);
		System.out.println("모델 "+yourcar.model);
		System.out.println("생 상 "+yourcar.color);
		System.out.println("최소속도 "+yourcar.maxspeed);
		System.out.println("현재 속도 "+yourcar.speed);
		
		//매개변수로 초기화하는 생성자로 객채 생성
		Car mycar2 = new Car("제네시스","White",350);
		System.out.println("===mycar2===");
		System.out.println("제작회사 "+mycar2.company);
		System.out.println("모델 "+mycar2.model);
		System.out.println("생 상 "+mycar2.color);
		System.out.println("최소속도 "+mycar2.maxspeed);
		System.out.println("현재 속도 "+mycar2.speed);
		
		
		

	}

}
