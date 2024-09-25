package my.study;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection1_1 {
    public static void main(String[] args) {

        HashMap<String, Object> map = new HashMap<>();
        HashMap map2 = new HashMap();  // Type 지정 안 해도 되네?

        ArrayList<String> arr = new ArrayList<>();

        arr.add("갠프 추가 기능");
        arr.add("이력서 쓰기");
        arr.add("공모전 회의");

        map.put("name", arr);     // 리스트에 넣은 걸 name이라는 key에 저장하면 해당 키는 값으로 리스트를 갖고 있는 게 된다!

        System.out.println(arr);  // 리스트 출력
        System.out.println(map.toString()); // 맵 출력
        System.out.println(map);  // 맵 출력(toString() 안 써도 똑같이 나오네? 근데 어차피 이 함수 회색으로 나오는데?)

        map2.put("name", arr);

        System.out.println(map2);
    }
}
