import java.util.Scanner;

public class yoyo1 {
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�Ӧr��");
		char c = scn.next().charAt(0);
		if(c>='0' && c<='9')
		    System.out.println("�z��J���O�Ʀr");
		else if (c>='A'&& c<='Z')
		    System.out.println("�z��J���O�j�g���r��");
		else if(c>='a'&& c<='z')
		    System.out.println("�z��J���O�p�g���r��");
		scn.close();
		
	}

}
