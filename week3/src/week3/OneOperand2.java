package week3;

public class OneOperand2 {

	public static void main(String[] args) {
		//단항 연산자 중 증감 연산자 : ++,--
		int x = 10;
		int y = 20;
		int z = 0;
		
		//++연산자 : 피연산자의 기존 값에 1을 더해준다.
		// ++기호가 왼쪽(앞)에 있는 경우: 먼저 1을 더해주고 명령문을 실행
		System.out.println("++x =" + (++x) );  //x = 11
		
		// ++기호가 오른쪽(뒤)에 있는 경우 : 명령문을 먼저 실행하고
		//다음으로 넘어갈떄 증감
		
		System.out.println("x++ =" +(x++) );  //x = 11
		System.out.println("x =" + x );
		// --연산다 : 피연산자의 기준 값에 1을 뺴준다
		
		z = x++;
		System.out.println("z =" +z); //z = 12
		System.out.println("z =" +x); // x = 13
		
		z = x++ + y--;
		System.out.println("z =" +z); //
		System.out.println("x =" +x); // 
		System.out.println("y =" +x); //
	}

}
