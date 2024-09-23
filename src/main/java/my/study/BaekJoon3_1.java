package my.study;

import java.util.Scanner;

public class BaekJoon3_1 {
    public static void main(String[] args) {
        // 입력한 시간보다 45분 이르게 알람 설정하기
        System.out.println("설정할 알람 시간을 입력해주세요.(H is Hour, M is Minute)");
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        setAlarm(h, m);
    }

    public static void setAlarm(int h, int m)  {
        // throws Exception 안 되는 이유는 메인 함수가 중단될 수도 있어서 그런건가?

        int nh, nm = 0;

        // 분이 45 보다 클 때, 시간은 그대로 두고 분만 -45
        if(m >= 45) {
            nh = h;
            nm -= 45;
        } else {
            // 분이 45 보다 작을 때 + 15(60 더하고 45 빼면 15니까)
            // 시간이 0이면 23시로 교체, 아니면 -1
            if(h == 0) {
                nh = 23;
            }
            else {
                nh = h - 1;
            }
            nm += 15;
        }

        // 설정된 분이 60이면 0으로 교체
        if(nm == 60) {
            nm = 0;
        }

        System.out.println("설정된 알람 시간은 " + nh +"시 " + nm + "분 입니다.");

    }
}
