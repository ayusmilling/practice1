import java.util.Scanner;

public class yoyo4 {
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		char grade;
		System.out.print("�п�J�Ҹզ��Z");
		int score = scn.nextInt();
		score = score / 10;
		switch(score){
		case 10 :
		case 9 :
		case 8 :
			grade = '��' ; break;
		case 7 :
			grade = '�A' ; break;
		case 6 : 
			grade = '��'; break;
		default:
			grade = '�B'; break;
		}
		System.out.println("�o�O�ݩ�" + grade + "�Ū����Z" );
		scn.close();
	}
}
