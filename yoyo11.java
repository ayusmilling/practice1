
public class yoyo11 {
	public static void main(String []args) {
		boolean i= false;
		Block1:{
			System.out.println("這是第一程式區");
			i = true;
		Block2:{
			if (i== true)	
				break Block2;
			System.out.print("這是第二個程式區塊");
			}
		System.out.println("已經跳出第二個程式區塊");
	}
		
	}

}
