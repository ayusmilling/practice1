import java.util.Scanner;

public class yoyo18 {
	public static void main(String[] args) {
		String [] A = new String [] {"�m�W", "�q�T�a�}","�q��"};
		char[][] B = new char [A.length] [];
		Scanner scn = new Scanner(System.in);
		String str;
		for(int num = 0; num< A.length; num++) {
			System.out.print("��J"+ A[num]+ ":");
			str = scn.nextLine();
			B[num]= new char[str.length()];
			for(int i = 0; i<str.length() ; i++) {
				B[num][i] = str.charAt(i);
			}
		}
		System.out.println("�z��J����Ƭ�: ");
		for (int i =0; i<A.length; i++) {
			System.out.print(A[i]+":");
			for(int k = 0; k<B[i].length; k++) {
				System.out.print(B[i][k]);
			System.out.println();
			}
			scn.close();
		}
	}
}
