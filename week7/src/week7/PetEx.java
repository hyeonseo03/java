package week7;

public class PetEx {
	public static void main(String[] args) {
		//객체 생성
		Pet mypet = new Pet("바둑이","강아지",3);
		
		//필드 값 출력
		System.out.println("<애완동물 정보>");
		System.out.println("이름 :"+mypet.name);
		System.out.println("종류: "+mypet.type);
		System.out.println("나이: "+mypet.age);
		
		//생성자 오버로딩을 이용해서 객체 초기화
		Pet pet1 = new Pet("초코","고양이");
		
		System.out.println("<애완동물 정보>");
		System.out.println("이름 :"+pet1.name);
		System.out.println("종류: "+pet1.type);
		System.out.println("나이: "+pet1.age);
		System.out.println("나이: "+pet1.color);
		
		Pet pet2 = new Pet("구름","강아지",2,"흰색");
		
		System.out.println("<애완동물 정보>");
		System.out.println("이름 :"+pet2.name);
		System.out.println("종류: "+pet2.type);
		System.out.println("나이: "+pet2.age);
		System.out.println("나이: "+pet2.color);
		
		
	}
}
