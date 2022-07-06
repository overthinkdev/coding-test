package collection.arraylist;

import java.util.ArrayList;
import collection.Member;
/* 순서있고 중복가능  LIFO ( Last In First Out ) 추가 push, 삭제 pop*/

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for( int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if( memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		System.out.println(arrayList);
	}
}