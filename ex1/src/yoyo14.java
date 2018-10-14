
public class yoyo14 {
	public static void main(String[] args) {
		int [] n = new int[] {56, 45, 68, 32};
		int sum = 0;
		for (int i : n) {
			System.out.println(i);
			sum += i;
		}
		System.out.print("n 陣列元素總合為" + sum );
	}
	
}
