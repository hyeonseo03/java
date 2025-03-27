package week4;

import java.util.Scanner;

public class BodyBMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		System.out.println("키(cm)를 입력하세요");
		int he = sc.nextInt();
		
		System.out.println("몸무게를 입력하세요");
		int we = sc.nextInt();
		
		//bmi구하기
		double mhe = he / 100.0;
		double bmi = we / (mhe * mhe);
		
		
		String result = "";
		
		if (18.5 <= bmi && bmi <23)
			 result = "정상";
		else if(23 <= bmi && bmi <25)
			result = "과체중";
		else if(25 <= bmi && bmi <30)
			result = "비만";
		else if(bmi >= 30)
			result = "고도비만";
		
		
		System.out.println(name + "님의 키는 " + he + "cm이고 몸무게는 " + we + "kg입니다" );
		System.out.printf("bmi= %.2f  %s \n" , bmi , result );
		
		
			
		
	}

}
