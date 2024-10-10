package my.study;

import java.util.Scanner;

// 문제: 25314번
public class BackJoon4_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력해주세요.");
        int n = sc.nextInt();

        writingCode(n);

    }

    static void writingCode(int n) {

        while((n-4) >= 0) {
            System.out.print("long ");
            n-=4;
        }
        System.out.println("int");

    }
}
