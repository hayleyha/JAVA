package week3;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("두 수를 입력하세요 : ");
		int x = in.nextInt();
		int y = in.nextInt();
		int max, min;
		
//		if(x > y) {
//			max = x;
//			min = y;			
//		}
//		else {
//			max = y;
//			min = x;
//		}
		
		//speed 가 60 이상이고 100이하이면 "정상속도"

		max = (x > y)? x : y;
		min = (x > y)? y : x;
		
		System.out.println(max + ", " + min);
		
	}
}
