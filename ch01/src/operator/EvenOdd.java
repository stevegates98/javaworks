package operator;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        // String result = num % 2 == 0 ? "짝수" : "홀수";
        String result;

        // if ~ else문
        if (num % 2 == 0){
            result = "짝수";
        } else {
            result = "홀수";
        }

        System.out.println(result);
    }
}
