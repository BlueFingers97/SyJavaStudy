package my.study;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BaekJoon1_3 {

    public static void main(String[] args) {
        System.out.println("계산에 사용할 세 자리 수를 2개 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // 첫 번째 세 자리 수
        String b = sc.next();  // 두 번째 세 자리 수
        int c = sc.nextInt();

        Calc1(a, b);
        Calc2(a, b);
        Calc3(a, b);
        Calc4(a, b);
        Calc5(a, c);
        Calc6(a, c);
    }

    // 방법 1~3(정수형 배열 사용하는 거 2개, 배열 사용 없이 바로 출력하는 거 1개)
    static void Calc1(int a, String b) {

        System.out.println("-----------방법 1~3----------");
        // int [] c = new int[b.length()];

        for(int i = b.length()-1; i>=0; i--) {
            // c[i] = b.charAt(i)-'0'; // '0'의 ASCII 값 빼기(문자형을 정수형으로 바꾸는 방법 1)

            // c[i] = Integer.parseInt(b.substring(i, i+1));  // 문자열 자르고, 정수형으로 형변환(문자형을 정수형으로 바꾸는 방법 2)

            // System.out.println(c[i]);  // 각각의 인덱스 값 출력

            System.out.println(a*(b.charAt(i) - '0'));  // 아니면 1번 방법을 쓰는데 배열에 안 담고 바로 출력하는 것도 있음(값 추출 -> 출력)
        }
        System.out.println(a*Integer.parseInt(b));

    }

    // 방법 4(문자 배열을 정수형으로)
    static void Calc2(int a, String b) {
        System.out.println("-----------방법 4----------");

        char[] d = b.toCharArray();  // 문자열을 문자 배열로 한 방에 바꾸기(반복문으로 하나하나 값 안 집어넣고 한방에)

        for(int i = b.length()-1; i>=0; i--) {
            System.out.println(a*(d[i] - '0'));  // 그리고 정수형으로 하나하나 출력
        }
        System.out.println(a*Integer.parseInt(b));

    }

    // 방법 5 람다식 사용(문자 배열을 정수형으로 사용하는 건 같은데 반복문을 람다식으로)
    static void Calc3(int a, String b) {
        System.out.println("-----------방법 5----------");

        IntStream.range(0, b.length())
                .forEach(i -> System.out.println(a*(b.charAt(i) - '0')));

        System.out.println(a*Integer.parseInt(b));
    }

    // 방법 6 람다식(배열 역순으로 돌기)
    static void Calc4(int a, String b) {
        System.out.println("-----------방법 6----------");

        // IntStream.iterate(start, condition, update)
        // 람다식은 반드시 ->를 사용한 표현식 형태로 작성해야 함
        IntStream.iterate(b.length() - 1, i -> i >= 0, i -> i - 1)
                .forEach(i -> System.out.println(a*(b.charAt(i) - '0')));

        System.out.println(a*Integer.parseInt(b));
    }

    // 방법 7(문자열 말고 정수형 한 자리씩 추출해서 계산하기)
    static void Calc5(int a, int c) {
        System.out.println("-----------방법 7----------");

        int[] arr = new int[3];

        arr[0] = (c / 10) / 10;
        arr[1] = (c / 10) % 10;
        arr[2] = c % 10;

        System.out.println(Arrays.toString(arr));
    }

    // 방법 8(들어오는 모든 자리수 추출해서 계산하기)
    static void Calc6(int a, int c) {
        System.out.println("-----------방법 8----------");

        int[]arr2 = new int[3];

        int d = c;

        for(int i = arr2.length-1; i >= 0; i--) {
            arr2[i] = c%10;
            c = c/10;
            System.out.println(a*(arr2[i]));
        }
        System.out.println(a*d);

        System.out.println(Arrays.toString(arr2));


    }
}
