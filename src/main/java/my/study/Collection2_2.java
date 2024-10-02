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

        // 이 코드가 제대로 작동하는 이유는 비교 대상이 되는 taskName들이 리터럴 문자열이기 때문
        // 자바에서 문자열 리터럴 간의 비교는 내용을 기준으로 하기 때문에 contains() 메서드를 사용해도 올바르게 비교할 수 있음
        // 자바에서 문자열은 객체이지만, 문자열 리터럴은 자바 내부적으로 String Pool이라는 메모리 공간에 저장된다.
        // 이로 인해 문자열 리터럴 간의 비교는 참조가 아닌 값을 기준으로 이루어진다.
        for(String taskName : test2) {
            if(!test.contains(taskName)) {
                test3.add(taskName);
            }
        }

        System.out.println(test3);
    }
}
