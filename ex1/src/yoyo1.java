import java.util.Scanner;

public class yoyo1 {
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字元");
		char c = scn.next().charAt(0);
		if(c>='0' && c<='9')
		    System.out.println("您輸入的是數字");
		else if (c>='A'&& c<='Z')
		    System.out.println("您輸入的是大寫的字母");
		else if(c>='a'&& c<='z')
		    System.out.println("您輸入的是小寫的字母");
		scn.close();
		
	}

}
