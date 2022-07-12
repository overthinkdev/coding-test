package codingtest.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11022 {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int a;
		int b;

		StringTokenizer sto;
		for (int i = 1; i <= t; i++) {
			sto = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(sto.nextToken());
			b = Integer.parseInt(sto.nextToken());
			
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
		}
		
		br.close();
	}

}
