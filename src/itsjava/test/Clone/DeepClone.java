package itsjava.test.Clone;

import java.util.Arrays;

public class DeepClone implements Cloneable {
	public String name;
	public int age;
	public int[] scores; // 깊은 복제 대상
	public Car car; //깊은 복제 대상
	
	public DeepClone(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 해서 name, age를 복제한다.
		DeepClone cloned = (DeepClone) super.clone(); // Object의 clone()호출
		//scores를 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); //메소드 재정의
		//Car 를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 DeepClone 객체를 리턴
		return cloned;
	}
	
}
