package week7;

public class Car {
	//자동차 객체를 만들기 위한 라이브러리용 클래스(설계도)
	//객체의 속성 =? 필즈
	String company = "현대 자동차";
	String model;
	String color;
	int maxspeed;
	int speed;
	
	//생성자가 선언되지 않으면 기본 생성자가 자동으로 만들어진다
	//생성자 오버로딩(overloading) => 생성자를 다양하게 제공
	Car(){
		//기본 생성자.
	}
	
	
	Car(String model){
		//this.model = model;
		//this.color = "black";
		//this.maxspeed = 300;
		this(model,"black",300);
	}
	
	Car(String model,String color)
	{
		//this.model = model;
		//this.color = color;
		//this.maxspeed = 250;
		this(model,color,250);
	}
	
	
	
	//매개변수로 초기값을 받아서 초기화하는 생성자 선언
	//생성자가 선언되면 기본 생성자는 자동으로 만들어지지 않음
	Car(String model,String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
		
	}
}
