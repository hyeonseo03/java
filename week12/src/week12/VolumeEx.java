package week12;

public class VolumeEx {

	public static void main(String[] args) {
		// 익명 구현객체 생성
		//구현 클래스 선언없이 바로 구현객체를 생성
		//인터페이스 변수 = new 인터페이스() {.....}
		
		Volume vol1 = new Volume() {

			@Override
			public void volumeUp(int level) {
				System.out.println("익명객체 불륨을 올립니다 :"+ level);
				
			}

			@Override
			public void volumeDown(int level) {
				System.out.println("익명객체 불륨을 내립니다 :"+ level);
				
			}
		};
		vol1.volumeUp(5);
		vol1.volumeDown(5);
	
		Volume vol2 = new Volume() {
		
		@Override
		public void volumeUp(int level) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void volumeDown(int level) {
			// TODO Auto-generated method stub
			
		}
	};
}
}
