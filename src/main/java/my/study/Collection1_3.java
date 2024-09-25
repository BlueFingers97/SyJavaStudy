package my.study;

import java.util.*;

public class Collection1_3 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("이자바", 80);
        map.put("박자바", 70);

        // map에서 가져온 데이터를 set에 저장
        Set set = map.entrySet();
        Iterator it = set.iterator();  // iterator 호출

        // iterator가 있는 데이터를 map.entry 구조로 받아서 키, 값 각각 꺼내기
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            int i = (int)it.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
        System.out.println("최고 : " + Collections.max(values));
        System.out.println("최저 : " + Collections.min(values));

    }
}
