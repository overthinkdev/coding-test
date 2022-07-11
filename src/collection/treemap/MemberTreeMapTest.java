package collection.treemap;

import collection.Member;


public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		//삽입 put 꺼낼때 get
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberShin);
		
//		memberHashMap.showAllMember();
		
		memberTreeMap.removeMember(102); //삭제
		
		memberTreeMap.showAllMember();

	}

}
