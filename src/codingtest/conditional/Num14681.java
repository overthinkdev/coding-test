package codingtest.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num14681 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		br.close();
		
		if(0<x) {
			if(0<y) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}
		else {
			if(y>0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
	}
}
