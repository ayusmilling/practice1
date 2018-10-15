
public class yoyo16 {
	public static void main(String[] args) {
		int [][] n= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int sum = 0;
		for( int[] r: n) {
			for(int i : r) {
				sum += i;
		}
	}
	System.out.println("N陣列元素總合為"+ sum);
}
}
