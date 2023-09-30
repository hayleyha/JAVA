package week3;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("속도를 입력하세요: ");
		int speed = in.nextInt();
		
		//speed 가 60 이상이고 100이하이면 "정상속도"
		if( 60 <= speed && speed <= 100)    {
			System.out.println("정상속도 ");
		
		}

