package itsjava.test.String;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("철수","유리","짱구");
		Stream<String> stream = list.stream();
		stream.forEach(name-> System.out.println(name));

		
		
		Iterator<String> Iterator = list.iterator();
		while(Iterator.hasNext()) {
		 String name = Iterator.next();
		 System.out.println(name);
		}
		
		
		
		
	}

}
