package codingtest.conditional;

import java.util.Scanner;

public class Num9498 {

	public static void main(String[] args) {
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		String score = sc.nextLine();
		int num = Integer.parseInt(score);
		
		//삼항
		System.out.print((num>=90)?"A": (num>=80)? "B": (num>=70)? "C": (num>=60)? "D": "F");
		
		//노가다
//		if(num<=100 || num>=90)
//			System.out.println("A");
//		else if(num<=89 || num>=80)
//			System.out.println("B");
//		else if(num<=79 || num>=70)
//			System.out.println("C");
//		else if(num<=69 || num>=60)
//			System.out.println("D");
//		else
//			System.out.println("F");
//		

	}

}
