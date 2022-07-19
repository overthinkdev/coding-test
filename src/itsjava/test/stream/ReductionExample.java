package itsjava.test.stream;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("짱구", 50),
				new Student("철수", 100),
				new Student("유리", 80)
		);
		
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();
		
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a,b) -> a+b)
				.get();
		
		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a,b) -> a+b);
		
		System.out.println("sum1: "+sum1);
		System.out.println("sum2: "+sum2);
		System.out.println("sum3: "+sum3);

	}

}
