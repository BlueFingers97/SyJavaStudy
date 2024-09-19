package my.study;


import java.util.Scanner;

public class BaekJoon1_1 {

    public static void main(String[] args) {
        System.out.println("두 수를 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        quizAddition(a, b);
        quizSubtraction(a, b);
        quizMultiplication(a, b);
        quizDivision(a, b);
        quizRemainder(a, b);
    }

    static void quizAddition(int a, int b) {
        System.out.println("두 수의 합을 출력합니다. --> " + (a+b));
    }

    static void quizSubtraction(int a, int b) {
        System.out.println("두 수의 차를 출력합니다. --> " + (a-b));
    }

    static void quizMultiplication(int a, int b) {
        System.out.println("두 수의 곱을 출력합니다. --> " + (a*b));
    }

    static void quizDivision(int a, int b) {
        System.out.println("두 수의 나눗셈을 출력합니다. --> " + (a/b));
    }

    static void quizRemainder(int a, int b) {
        System.out.println("두 수의 나머지를 출력합니다. --> " + (a%b));
    }
}


