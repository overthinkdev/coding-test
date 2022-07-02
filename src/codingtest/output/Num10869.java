package codingtest.output;

import java.util.Scanner;

public class Num10869 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    
    		if(a >= 1 && b <= 10000){
    			System.out.println(a+b);
    			System.out.println(a-b);
    			System.out.println(a*b);
    			System.out.printf("%d\n",a/b);
    			System.out.printf("%d",a%b);
    			sc.close();
    		}
	}
	//첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
}
