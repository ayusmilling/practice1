import java.util.Scanner;

public class yoyo5 {
	public static void main(String []args ) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J1~3��ܺ���:(1.�q���u�ݲ� 2. �u�ݲ� 3. ����)");
		String kind = scn.next();
		int money1 = 500;
		switch (kind){
			case "1" : 
				money1 *=0.7;
			case "2" :
				money1 *=0.8;
		}
		System.out.println("������"+ money1 + "��");
		scn.close();
	}

}
