package my.study;

import java.util.Scanner;

public class BaekJoon2_3 {
    public static void main(String[] args) {

        System.out.println("위치를 확인할 좌표를 입력해주세요.");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        quadrant(x, y); // Quadrant : 좌표
        quadrant2(x, y);
    }

    public static void quadrant(int x, int y) {
        if(x >= 0 && y >= 0) {
            System.out.println("제 1사분면에 위치합니다.");
        } else if (x < 0 && y >= 0) {
            System.out.println("제 2사분면에 위치합니다.");
        } else if (x < 0 && y < 0) {
            System.out.println("제 3사분면에 위치합니다.");
        } else if (x >= 0 && y < 0) {
            System.out.println("제 4사분면에 위치합니다.");
        }
    }

    public static void quadrant2(int x, int y) {
        if(x >= 0) {
            if(y >= 0) {
                System.out.println("제 1사분면에 위치합니다.");
            } else {
                System.out.println("제 4사분면에 위치합니다.");
            }
        }

        if(x < 0) {
            if(y >= 0) {
                System.out.println("제 2사분면에 위치합니다.");
            } else {
                System.out.println("제 3사분면에 위치합니다.");
            }
        }
    }
}
