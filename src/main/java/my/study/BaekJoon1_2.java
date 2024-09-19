package my.study;

import java.util.Scanner;

public class BaekJoon1_2 {
    public static void main(String[] args) {

        System.out.println("세 수를 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
        calc(a, b, c);
    }

    static void calc(int a, int b, int c) {
        System.out.println("나머지 계산 차례대로 출력합니다.");
        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);
    }
}
