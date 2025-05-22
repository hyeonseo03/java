package week12;

public class SmartTv implements RemoteControl, Searchable {
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Smart tv를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smart tv를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
	}

}
