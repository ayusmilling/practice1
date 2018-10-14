import java.util.Scanner;

public class yoyo3 {
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入的要測試的年份");
		int year = scn.nextInt();
		if ( year % 400 == 0)
			System.out.print("您輸入的是閏年");
		else if(year % 4 ==0) && (year %100 != 0)
		System.out.print("您輸入的是閏年");
		else
			System.out.print("您輸入的不適閏年");
		scn.close();
	}

}
