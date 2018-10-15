
public class yoyo24 {
	public static void main(String[] args) {
		int a = 10; int b = 15;
		System.out.println(" 傳直呼叫前\ta " + a +"\ta = " + b);
		byVal (a, b);
		System.out.println(" 傳直呼叫後\ta " + a + "\ta = " + b);
	}
	
	static void byVal(int x, int y) {
		x += 3;
		y += 2;
		System.out.println(" 傳直呼叫中\ta "+ x + "\ta = " + y);
	}
}
