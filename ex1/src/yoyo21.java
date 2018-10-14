import java.util.Arrays;
import java.util.Scanner;

public class yoyo21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [] arr = new int[] {83, 25, 31, 5, 52, 17, 42, 63, 11, 9};
		System.out.print(" 排序前 : ");
		for(int i = 0; i< arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
		Arrays.sort(arr);
		System.out.print("排序後 : ");
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
		System.out.print("請輸入搜尋值: ");
		int sNum = scn.nextInt();
		int find = -1;
		if((find = Arrays.binarySearch(arr, sNum)) > -1){
			System.out.print("找到 " + sNum +"位於座標" + find +"處");
		} else 
			System.out.print("找不到" + sNum);
		scn.close();
	}
}
