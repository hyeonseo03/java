package week14;

public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("hello");
		String sVal = (String)box.getObj();
		
		box.setObj(100);
		int iVal = (int)box.getObj();
		
		

	}

}
