import java.util.Scanner;

public class yoyo5 {
	public static void main(String []args ) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入1~3選擇種類:(1.敬老優待票 2. 優待票 3. 全票)");
		String kind = scn.next();
		int money1 = 500;
		switch (kind){
			case "1" : 
				money1 *=0.7;
			case "2" :
				money1 *=0.8;
		}
		System.out.println("票價為"+ money1 + "元");
		scn.close();
	}

}
