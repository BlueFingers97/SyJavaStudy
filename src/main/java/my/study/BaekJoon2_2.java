package my.study;

import java.util.Scanner;

public class BaekJoon2_2 {
    public static void main(String[] args ) {
        System.out.println("시험 점수를 입력해주세요.");

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        myGrade(score);
    }

    public static void myGrade(int score) {
        if(score >= 90) {
            System.out.println('A');
        } else if(score >= 80) {
            System.out.println('B');
        } else if(score >= 70) {
            System.out.println('C');
        } else if(score >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
