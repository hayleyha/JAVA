package week3;
import java.util.Scanner;

public class calTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("초 입력하시오: ");
		int time = sc.nextInt();
		int sec = (time%60);
		int min = (time/60);
		
		System.out.println(time + "초는" + min + "분" + sec + "초 입니다.");
		
	} 
}

