import java.util.Scanner;

public class yoyo3 {
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���n���ժ��~��");
		int year = scn.nextInt();
		if ( year % 400 == 0)
			System.out.print("�z��J���O�|�~");
		else if(year % 4 ==0) && (year %100 != 0)
		System.out.print("�z��J���O�|�~");
		else
			System.out.print("�z��J�����A�|�~");
		scn.close();
	}

}
