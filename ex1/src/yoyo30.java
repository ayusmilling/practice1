
	class CMath{
		public void getMax(int a, int b) {
			int bigNum;
			if(a>b) bigNum = a;
			else bigNum = b;
			System.out.println(a + "�P" + b + "���̤j�Ƭ�" + bigNum);
		}
	}
	class SonCMath extends CMath{
		public void getFabonacci(int a ) {
			int firstNum = 0, secondNum = 1;
			System.out.print("�O���ƦC: ");
			System.out.print(firstNum + " , "+ secondNum );
			int ans;
			for(int i = 2; i <=a; i++) {
				ans = firstNum +secondNum ;
				System.out.print(",  "+ ans);
				firstNum = secondNum;
				secondNum = ans;
			}
		}
	}
	class GrandSonCMath extends SonCMath{
		public void getFactorial(int a) {
			int ans = 1, i;
			if(a==0) ans = 1;
			else
				for(i= 1; i<=a; i++)
					ans*= i;
			System.out.print(a+ "! = "+ ans);
		}
	}

public class yoyo30 {
	public static void main(String [] args) {
		GrandSonCMath math2 = new GrandSonCMath();
		math2.getMax(10, 20);
		math2.getFabonacci(10);
		System.out.println();
		math2.getFactorial(5);
	}
	
}
