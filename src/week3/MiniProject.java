package week3;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.print("번호를 선택하세요 : ");

        int number = sc.nextInt();
		//cel -> 섭씨 
		//fah -> 화씨 
        switch (number) {
            case 1:
                System.out.print("화씨온도를 입력하세요: ");
                double cel = sc.nextDouble();
                double fah = celTofah(cel);
                System.out.println("섭씨온도는 : " + fah + " °F");
                break;
            case 2:
                System.out.print("섭씨온도를 입력하세요: ");
                double fahInput = sc.nextDouble();
                double celOutput = fahTocel(fahInput);
                System.out.println("화씨온도는 : " + celOutput + " °C");
                break;
        }

        sc.close();
    }

    // 섭씨를 화씨로 변환
    public static double celTofah(double cel) {
        return (cel * 9/5) + 32;
    }

    // 화씨를 섭씨로 변환
    public static double fahTocel(double fah) {
        return (fah - 32) * 5/9;
    }
}
