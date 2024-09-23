package my.study;

import java.util.Scanner;

public class BaekJoon3_2 {
    public static void main(String[] args) {
        // 주사위를 3번 던져서 나온 값에 따라 상금 돌려 받기
        System.out.println("주사위를 3번 돌려주세요.(숫자 3개 입력)");
        Scanner sc = new Scanner(System.in);

        // 주사위 던지기 1~3번
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        gift(one, two, three);
    }

    public static void gift(int one, int two, int three) {

        int bonus = 0;
        int prize = 0;

        // 3번 모두 같은 수가 나왔다면
        if(one == two && one == three) {
            bonus = 1000;
            prize = 10000 + (one * bonus);
        } else if(one == two || one == three) {
            // 2번 같은 수가 나왔다면
            bonus = 100;
            prize = 1000 + (one * bonus);
        } else if(two == three) {
            // 2번 같은 수가 나왔다면
            bonus = 100;
            prize = 1000 + (two * bonus);
        } else if(one != two && two != three && one != three) {
            // 전부 다른 수가 나왔다면
            int max = one;
            // 최대값 찾기
            if (max > two) {
                prize = max * 100;
            } else if (max > three) {
                prize = max * 100;
            } else {
                prize = max * 100;
            }
        }

        // Math.max 함수 사용
        // System.out.print((Math.max(Math.max(a, b), c)*100));

        System.out.println("축하합니다. 받으실 총 상금은 " + prize + "입니다!");


    }
}
