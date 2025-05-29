package week13;

public class Calculator {
	//공유 객체용 클래스
	private int memory;

	public int getMemory() {
		return memory;
	}

	//synchronized : 여러 스레드가 동시에 하나의 자원(메서드나 블록)에 접근하지 못하게 막는 것
	public synchronized void setMemory(int memory) throws InterruptedException {
		this.memory = memory;
		
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
}
