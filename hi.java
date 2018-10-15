import java.util.Scanner;

public class hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn= new Scanner (System.in);
			System.out.println("請輸入姓名: ");
			String strName = scn.next();
			System.out.println("hi! "+strName + ",歡迎來到JAVA世界! ");
			scn.close();

	}

}
