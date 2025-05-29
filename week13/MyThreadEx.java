package week13;

public class MyThreadEx {
	public static void main(String[] args) throws InterruptedException {
		for (int i=0; i<100; i++) {
			MyThread thread = new MyThread(i);
			thread.start();
			//해당 스레드가 종료될 때까지 
			//현재 스레드를(blocking) 대기 상태로 만든다.
			thread.join();
		}
	}

}
