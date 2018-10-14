import java.util.Scanner;

public class yoyo4 {
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		char grade;
		System.out.print("請輸入考試成績");
		int score = scn.nextInt();
		score = score / 10;
		switch(score){
		case 10 :
		case 9 :
		case 8 :
			grade = '甲' ; break;
		case 7 :
			grade = '乙' ; break;
		case 6 : 
			grade = '丙'; break;
		default:
			grade = '丁'; break;
		}
		System.out.println("這是屬於" + grade + "級的成績" );
		scn.close();
	}
}
