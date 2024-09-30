package my.study;

import java.util.*;

public class Collection2_2 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();

        map.put("taskName", Arrays.asList("과제 제출", "이력서 작성", "독서"));

        HashMap<String, Object> map2 = new HashMap<>();

        map2.put("taskName", Arrays.asList("청소", "과제 제출", "이력서 작성", "물 많이 마시기"));

        System.out.println(map);
        System.out.println(map2);
        System.out.println("----------------------------------------------");

        List<String> test = (List<String>) map.get("taskName");
        List<String> test2 = (List<String>) map2.get("taskName");

        System.out.println(test);
        System.out.println(test2);

        ArrayList<String> test3 = new ArrayList<>();

//        for(int i = 0; i < test2.size(); i++) {
//            if(!test.contains(test2.get(i))) {
//                test3.add(test2.get(i));
//            }
//        }

        for(String taskName : test2) {
            if(!test.contains(taskName)) {
                test3.add(taskName);
            }
        }

        System.out.println(test3);
    }
}
