package my.study;

import java.util.HashMap;
import java.util.Scanner;

public class Collection1_2 {
    public static void main(String[] args) {

        HashMap map = new HashMap();

        map.put("hello", "1234");
        map.put("user", "1234");

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("아이디와 비밀번호를 입력해주세요.");
            System.out.println("ID : ");
            String id = sc.nextLine().trim();

            System.out.println("PW : ");
            String pw = sc.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            if(!(map.get(id)).equals(pw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 시도해주세요.");
            } else {
                System.out.println("로그인 성공!");
                break;
            }
        }
    }
}
