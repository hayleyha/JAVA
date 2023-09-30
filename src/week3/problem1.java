package week3;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		String Alphabet, grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영문 대문자 입력하시오: ");
		Alphabet = sc.next();
		
		switch(Alphabet) {
		case "A":		grade = "Excellent"; 		break;
		case "B":		grade = "Good";				break;
		case "C": 		grade = "Usually"; 			break;
		case "D":		grade = "Effort";			break;
		case "F":		grade = "Failure";			break;
		default: 		grade = "error";			break;
		}
		System.out.print(grade);
	}
}


