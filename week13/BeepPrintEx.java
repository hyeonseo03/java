package week13;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		//'삐~' 소리를 내는 작업
		for (int i=0; i<5; i++) {
			System.out.println("삐~");
			Thread.sleep(1000);
		}
		
		System.out.println("\n");
		//'***' 출력하는 작업
		for (int i=0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}