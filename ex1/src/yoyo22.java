
public class yoyo22 {
	void add(int x, int y) {
	System.out.print("呼叫MycClass 類別的add方法  --->  ");
	System.out.println(x + "+" +  y + "= " + (x+y));
}

public static void main(String[] args) {
	int a = 20;
	yoyo22 c1 = new yoyo22();
	 c1.add(a + 5, 3);
	 MyCal c2 = new MyCal();
	 c2.add(a - 7, 2);
}
}

class MyCal{
	void add(int x, int y) {
		System.out.print("呼叫MyCal  類別的add方法--> ");
		System.out.print(x + "-" + y + "="+ (x-y));
	}
}