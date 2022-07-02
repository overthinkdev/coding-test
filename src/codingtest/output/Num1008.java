package codingtest.output;

import java.util.Scanner;

public class Num1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
       
        //double 는 10e9이하 부터 출력한다.
        if(A > 0 && B < 10){
          
            	System.out.println(A/B);
            	sc.close();
        }
	}
}
