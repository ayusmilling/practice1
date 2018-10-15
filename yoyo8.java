
public class yoyo8 {
	public static void main (String []args ) {
		int i =1, j = 1;
		while(i <=9) 
		{
			while(j <= 9) {
				System.out.printf("%d*%d= %2d  " , i, j, i*j);
				j++;
			}
			i++;
			j = 1;
			System.out.println();
		}
	}
}
