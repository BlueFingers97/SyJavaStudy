package my.study;

import java.util.Scanner;

// 문제: 8393번
public class BaekJoon4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 수를 입력해주세요.");

        int n = sc.nextInt();
        sum(n);     // 합 구하는 함수 호출
    }

    static void sum(int n) {

        int sum = 0;
        // 꼭 1부터 시작하기!
        for(int i = 1; i <= n; i++) {
            sum += i;
        }


        System.out.println("입력하신 수까지의 모든 수의 합은 : " + sum + " 입니다.");
    }
}
