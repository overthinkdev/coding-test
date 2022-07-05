package itsjava.test.Clone;

public class CloneMethod {

	public static void main(String[] args) {
		//원본 객체
		Test original = new Test("overthink", "KYJ", "8282", 27, true);
		
		//복제 객체 생성 후, password 변경
		Test cloned = original.getClone();
		cloned.password = "0000";
		
		System.out.println("[복제 객체 필드값]");
		System.out.println("id: "+cloned.id);
		System.out.println("id: "+cloned.name);
		System.out.println("id: "+cloned.password);
		System.out.println("id: "+cloned.age);
		System.out.println("id: "+cloned.adult);
		System.out.println();
		System.out.println("[원본 객체 필드값]");
		System.out.println("id: "+original.id);
		System.out.println("id: "+original.name);
		System.out.println("id: "+original.password);
		System.out.println("id: "+original.age);
		System.out.println("id: "+original.adult);
		
	}

}
