import java.util.Scanner;

public class yoyo7 {
	public static void main(String []args ) {
		Scanner scn = new Scanner(System.in);
		int num = 1;
		int sum = 0;
		String numLine= "";
		while(num != 0) {
			System.out.print("請輸入整數累計總合(輸入0結束計算)");
			num = scn.nextInt();
			sum += num;
			if (num != 0)
				numLine+=("+");
		}
		System.out.printf(numLine + " = " + sum);
		scn.close();
	}

}
