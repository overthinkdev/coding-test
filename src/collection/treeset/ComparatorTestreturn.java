package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		
		return str1.compareTo(str2) * (-1);
	}
	
	
}

public class ComparatorTestreturn {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<String>(new MyCompare());
		//new MyCompare() 를 사용하면 내림차순
		//기존에 있는 정렬방식을 바꿔서 쓸때, 새로 정의할때 기본적으로는 comparable을 많이 쓴다.
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree);

	}

}
