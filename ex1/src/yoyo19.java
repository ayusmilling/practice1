
public class yoyo19 {
	public static void main(String[] args) {
		int[] aNum = {32,24,11,48,15};
		System.out.print(" �� �� �e  :");
		for (int a = 0; a < aNum.length; a++) 
			System.out.print("  " + aNum[a]);
		System.out.println();
		int n = aNum.length;
		int t;
		for(int i = n-2; n>= 0; n--) {
			for(int j= 0; j<= i; j++) {
				if(aNum[j] > aNum[j + 1]) {
					t = aNum[j];
					aNum[j] = aNum[j + 1];
					aNum[j + 1] = t;
				}
			}
			System.out.print("��" + (4-i) + "���`�� :");
			for(int a = 0; a < aNum.length; a++)
				System.out.print("  " + aNum[a]);
			System.out.println();
			}
		System.out.print("�� �� �� :");
		for (int a = 0; a < aNum.length; a++)
			System.out.print("  " + aNum[a]);
		}
	}

