package loopexample;

import java.util.Scanner;

public class KeyRepeat {
    public static void main(String[] args) {
        // "y" - 계속 반복, "n" - 반복 중단, 그 이외 키는 지원안함
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("계속 반복할까요?(y/n) ");
            String key = scan.nextLine(); // char는 안됨, 문자 입력

            // equals() : 문자열이 같은지 비교. 소속은 String 클래스.
            // 숫자가 같은지 비교할 때는 == 사용
            if(key.equals("y")) {
                System.out.println("계속 반복");
            } else if (key.equals("n")) {
                System.out.println("반복 중단");
                break;
            } else {
                System.out.println("지원하지 않는 키 입니다.");
            }
        }
        System.out.println("프로그램 종료");

        scan.close();
    }
}
