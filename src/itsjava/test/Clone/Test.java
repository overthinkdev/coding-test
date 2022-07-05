package itsjava.test.Clone;

public class Test implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public Test() {
	
	}

	public Test(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Test getClone() {
		Test cloned = null;
		try {
			cloned = (Test)clone(); //리턴타입은 Object이므로 캐스팅 해야함
		}catch(CloneNotSupportedException e) {}
		return cloned;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
}
