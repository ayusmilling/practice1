import java.util.Scanner;

public class yoyo10{
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in); 
		int num1 = 36, num2 = 12;
		String sel;
		do {
			System.out.println("***四則運算選單***");
			System.out.println("    A. 加 (+)");
			System.out.println("    B. 減 (-)" );
			System.out.println("    C. 乘 (*)");
			System.out.println("    D.除 (/)");
			System.out.println("****************");
		do {	System.out.print("請選擇功能:  ");
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
					System.out.print("結束程式");
			}
		}	while(!(sel.equals("E")));
			scn.close();		
		}
}

