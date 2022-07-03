package codingtest.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hour = br.readLine();
		br.close();
		String[] hournum  = hour.split(" ");
		int H = Integer.parseInt(hournum[0]);
		int M = Integer.parseInt(hournum[1]);
		
		if(M<45) {
			H--;
			M = 60-(45-M);
			if(H<0) {
				H=23;
			}
			System.out.println(H+" " +M);
		}
		else{
			System.out.println(H+" "+(M-45));
		}
	}
}
