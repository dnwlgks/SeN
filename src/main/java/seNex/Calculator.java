package seNex;

public class Calculator {
	
	private int result;
	
	public void sub(int x, int y) {
		result = x-y;
	}
	public void add(int x, int y) {
		result = x+y;
	}
	
	public int getResult() {
		return result;
	}

}
