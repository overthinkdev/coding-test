package codingtest.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer sto;
		for(int i = 1; i<= t; i++) {
			sto = new StringTokenizer(br.readLine(), " ");
			System.out.println("Case #"+ i + ": "
					+(Integer.parseInt(sto.nextToken())
							+Integer.parseInt(sto.nextToken())));
		}
		
		br.close();
	}

}
