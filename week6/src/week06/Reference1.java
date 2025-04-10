package week06;

public class Reference1 {

	public static void main(String[] args) {
		// 기본 데이터 타입: 스택영역에 변수와 값이 같이 저장
		int iVal1 = 100;
		int iVal2 = 100;
		
		System.out.println("iVal1 == iVal2 : " +(iVal1==iVal2?true : false));
		
		
		//참조 타입 : 변수는 스택영역에 생석되고 해당 객체는 힙 영역에 생성
		//스택영역의 변수에는 주소가 저장
		//대표적인 클래스 변수 : String
		
		String sVal1 = "Java";
		String sVal2 = "Java";
		// 문자 리터널이 동일한 경우 => 같은 객체를 공유(동일한 주소 참조)		
		System.out.println("sVal1==sVal2 : "+ (sVal1==sVal2?"참조가 같다" : "참조가 다르다"));
		//동일한 문자 리너널은 한개만 만든다
		
		String sVal3 = new String("Java");
		String sVal4 = new String("Java");
		System.out.println("sVal3==sVal4 : "+ (sVal3==sVal4?"참조가 같다" : "참조가 다르다"));
		//new 연산자로 만드면 같은 문자라도 독립적으로 만들어 진다 
		
		//참조타입 변수는 초기값으로 null 값을 사용할 수 있다.
		//이런경우는 변수만 스택에 생성된다. 힙에는 아무것도 생기지 않는다.
		String sVal5 = null;
		//문자열의 길이는 힙영역에 생성된 변수는 반환이 안된다
		//NullPointerExcepion 주의
		
		//System.out.println("sVal5.length="+sVal5.length());
		sVal5 = "Java";
		System.out.println("sVal1==sVal5:"+(sVal1==sVal5?"참조가 같다" : "참조가 다르다"));
		
		//문자열 값을 비교하고자 할 떄는
		//반드시 equals() 매소드를 사용
		if (sVal3.equals(sVal4))
			System.out.println("sVal3과 sVal4의 문자열 값은 같다");
		else
			System.out.println("sVal3과 sVal4의 문자열 값을 다르다.");
		//"Java"의 주소값은 다르지만 값을 같다
		
		
		
		
	}

}
