import java.util.Scanner;

public class yoyo2 {
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.print("請輸入第一個數字: ");
		num1 = scn.nextInt();
		System.out.print("請輸入第二個數字: ");
		num2 = scn.nextInt();
		System.out.print("請輸入第三個數字: ");
		num3 = scn.nextInt();
		if(num1 >num2) {
			if (num1>num3)
			    max  = num1;
			    else
				max = num3;
			}else {
				if (num2>num3)
					max = num2;
				else
					max = num3;
			}
		System.out.print("最大的數字是" + max);
		scn.close();
	}
}
