import java.util.Scanner;

public class yoyo20 {
	public static void main(String[] args) {
		int[] Adata = new int [] {5, 3, 1, 2, 10, 9, 4, 8, 7, 6};
		for(int i = 0; i < Adata.length; i++) {
			System.out.print(" �� "+ (i + 1) + "�Ӽ� = " + Adata[i]);
			if(i == 4 || i ==9 )
				System.out.println();
		}
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�n�j�M���Ʀr : ");
		int searchNum = scn.nextInt();
		int num = -1;
		for(int j = 0; j < Adata.length; j++) {
			if (Adata[j] == searchNum){
				num = j;
				break;
			}	
			}
		System.out.print("===============");
		if(num == -1)
			System.out.println("�S���o�ӼƦr-- >" + searchNum);
		else
			System.out.print("   " + searchNum + "�O��  " + (num + 1) + "�Ӽ� �A");
		scn.close();
	}
}
