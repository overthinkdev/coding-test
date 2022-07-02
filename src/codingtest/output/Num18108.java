package codingtest.output;

import java.util.Scanner;

public class Num18108 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if(y>=1000 && y<=3000) {
			System.out.printf("%d",y-543);
		}
		sc.close();
	}

}
