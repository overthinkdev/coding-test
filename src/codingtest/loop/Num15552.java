package codingtest.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://st-lab.tistory.com/30
// 못풀어서 참고함... 괜찮은 내용도 있음
public class Num15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 버퍼라는 저장공간에서 데이터를 모았다가 한번에 보냄
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()); // StringTokenizer는 자르는 기준을 기입하지 않아도 '스페이스바'를 기준으로 문자열을 다릅니다.
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
			
		}
		br.close();
		bw.flush(); //강제로 버퍼에있는 문자들을 빼버린다.
		bw.close();
		

	}

}
