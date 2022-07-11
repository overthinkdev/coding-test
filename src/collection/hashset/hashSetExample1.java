package collection.hashset;

import java.util.*;

public class hashSetExample1{
	public static void main(String[] args){
     Set<String> set = new HashSet<String>();
     
     set.add("Java");
     set.add("leaning");
     set.add("Java"); // "Java"는 한번만 저장
    
     set.size(); // 저장된 객체수 얻기
     
     Iterator<String> iterator = set.iterator(); //이터레이터 반복자
     while(iterator.hasNext()){ // 객체 수만큼 루핑
      String element = iterator.next(); // 한 개의 객체를 가져옴
      System.out.println("\t" + element); 
     }
    }
}