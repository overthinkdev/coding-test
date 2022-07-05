package itsjava.test.String;

public class ByteToStringExample {

	public static void main(String[] args) {
//		배열 전체를 String 객체로 생성
//		String str = new String(byte[] bytes);
		
//		지정한 문자셋으로 디코딩
//		String strc = new String(byte[] bytes, String charsetName);

//		배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성
//		String strd = new String(byte[] bytes, int offset, int length);
		
//		지정한 문자셋으로 디코딩
//		String stre = new String(byte[] bytes, int offset, int length, String charsetName);
		
		//예제
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		/* 리턴타입    메소드명(매개변수)    설명 */

		//char     charAt(int index) // 특정 위치(인덱스번호)의 문자 리턴
		//boolean  equals(Object aObject) // 두 문자열을 비교(데이터 값 비교) *참조와 배열은 다름
		//byte[]   getBytes() // byte[] 로 리턴
		//byte[]   getBytes(Charset charset) // 주어진 문자셋으로 인코딩한 byte[]로 리턴
		//int      indexOf(String str) // 문자열 내에서 주어진 문자열의 위치를 리턴
		//int      length() // 총 문자의 수를 리턴
		//String   replace(CharSequence target, CharSequence replacement)
//		         target 부분을 replacement로 대치한 새로운 문자열을 리턴

	}

}
