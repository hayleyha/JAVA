package week3;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		int number, days;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월(month)을 입력하시오 : ");
		number = sc.nextInt();
		
		switch(number) {
		case 1:case 4:
			days = 31; 			break;
		case 2:		days = 28;			break;
		case 3: 	days = 31; 			break;
		case 5: 	days = 31;			break;
		case 6: 	days = 30;			break;
		case 7: 	days = 31;			break;
		case 8: 	days = 30;			break;
		case 9: 	days = 31;			break;
		case 10: 	days = 30;			break;
		case 11: 	days = 31;			break;
		case 12: 	days = 30;			break;
		default: 	days = 0;			break;
		}
		System.out.print(days);
	}
}


