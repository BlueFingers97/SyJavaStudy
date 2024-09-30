package my.study;

import java.util.*;

public class Collection2_1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("name", Arrays.asList("카페 가기", "갠프 작업", "이력서 쓰기", "이론 공부"));

        System.out.println(map.get("name"));
        System.out.println(map);

        LinkedHashMap linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("name", Arrays.asList("카페 가기", "갠프 작업", "이력서 쓰기", "이론 공부"));
        System.out.println(linkedHashMap);
        System.out.println("----------------------------------------------");

        Iterator it = linkedHashMap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("----------------------------------------------");

        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> m = new HashMap<>();
        m.put("name", "가보자고");
        m.put("checkedYn", "Y");
        m.put("deleteYn", "N");

        list.add(m);

        m.put("name", "test");
        m.put("checkedYn", "Y");
        m.put("deleteYn", "N");

        list.add(m);

        System.out.println(list);

    }
}
