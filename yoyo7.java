import java.util.Scanner;

public class yoyo7 {
	public static void main(String []args ) {
		Scanner scn = new Scanner(System.in);
		int num = 1;
		int sum = 0;
		String numLine= "";
		while(num != 0) {
			System.out.print("�п�J��Ʋ֭p�`�X(��J0�����p��)");
			num = scn.nextInt();
			sum += num;
			if (num != 0)
				numLine+=("+");
		}
		System.out.printf(numLine + " = " + sum);
		scn.close();
	}

}
