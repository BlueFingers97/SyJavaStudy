package my.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection2_3 {
    public static void main(String[] args) {

        addTodoList("테스트 데이터 입니다", "Y", "Y");
        addTodoList("커피가 별로네여", "N", "N");
        addTodoList("깨찰빵은 맛나욤", "N", "N");

    }

    public static void addTodoList(String taskName, String checkedYn, String deleteYn) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("taskName", taskName);
        map.put("checkedYn", checkedYn);
        map.put("deleteYn", deleteYn);

        List<Map<String, Object>> arr = new ArrayList<>();

        arr.add(map);

        System.out.println(arr);
    }
}
