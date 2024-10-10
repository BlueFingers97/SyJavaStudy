package my.study;

import java.util.Scanner;

// 문제: 25304(영수증 확인하기)
// 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
// 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
// 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
// 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다
public class BaekJoon4_2 {
    public static void main(String[] args) {

        calculate(); // 계산기 호출

    }

    static void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("총 구매액을 입력해주세요.");
        int x = sc.nextInt();   // 총 구매액
        System.out.println("구매한 물건의 개수를 입력해주세요.");
        int n = sc.nextInt();   // 구매한 물건의 개수

        int calculatedTotal = 0;          // 계산한 가격을 담을 변수

        for(int i = 0; i < n; i++) {
            System.out.println("구매한 물품의 가격과 개수를 입력해주세요.");
            int a = sc.nextInt();  // 물건의 가격
            int b = sc.nextInt();  // 물건의 개수

            calculatedTotal += (a*b);        // 가격*개수를 total에 더하기
        }

        // 구매액과 계산한 총 구매액이 같으면 Yes, 다르면 No(기본 조건문)
        /**

        if(x == calculatedTotal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        */

        // 삼항 연산자 사용한 조건부 출력
        System.out.println((x == calculatedTotal) ? "Yes" : "No");

        sc.close();
    }
}
