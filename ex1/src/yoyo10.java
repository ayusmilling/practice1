import java.util.Scanner;

public class yoyo10{
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in); 
		int num1 = 36, num2 = 12;
		String sel;
		do {
			System.out.println("***�|�h�B����***");
			System.out.println("    A. �[ (+)");
			System.out.println("    B. �� (-)" );
			System.out.println("    C. �� (*)");
			System.out.println("    D.�� (/)");
			System.out.println("****************");
		do {	System.out.print("�п�ܥ\��:  ");
		sel = scn.next().toUpperCase();
			}while("ABCDE".indexOf(sel)==-1);
			switch(sel){
				case "A":
					System.out.printf("%d + %d = %d%n  ", num1, num2, num1+ num2);
					break;
				case "B":
					System.out.printf("%d - %d = %d%n", num1, num2, num1- num2);
					break;
				case "C":
					System.out.printf("%d * %d = %d%n", num1, num2, num1 * num2);
					break;
				case "D":
					System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2 );
					break;
				case "E":
					System.out.print("�����{��");
			}
		}	while(!(sel.equals("E")));
			scn.close();		
		}
}

