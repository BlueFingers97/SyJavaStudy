package my.study;

import java.util.Scanner;

public class BaekJoon2_1 {

    public static void main(String[] args) {
        System.out.println("비교를 원하는 두 수를 입력해주세요.");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        comparison(a, b);
    }

    public static void comparison(int a, int b) {

        if(a > b) {
            System.out.println('>');
        } else if(a < b) {
            System.out.println('<');
        } else if(a == b){
            System.out.println("==");
        }
    }
}
