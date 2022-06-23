package operator;

public class BitOperator {
    public static void main(String[] args) {
        // 비트 논리 연산자
        int num1 = 5; // 0000 0101
        int num2 = 10; // 0000 1010
        int result;
        result = num1 & num2; // 두 수의 2진수값을 비트 단위로 비교하여 같은 비트만 1이 되는 수를 만든다. 0000 0000 (모두 1일때만 1, 아니면 0).
        System.out.println(result);

        result = num1 | num2; // 0000 1111 (둘 중 하나라도 1이어도 1)
        System.out.println(result); // 15

        // 비트 이동 연산
        int val = 2; // 0000 0010
        System.out.println(val << 1); // 왼쪽으로 1만큼 이동(0000 0100)했으므로 10진수 4가 출력된다.
        System.out.println(val >> 1); // 오른쪽으로 1만큼 이동(0000 0001)했으므로 10진수 1가 출력된다.

        // 2진수, 16진수 표기
        int n = 10;
        int bNum = 0b1010; // 0b는 2진수를 의미하며, 앞에 0b를 붙여주면 2진수로 표기할 수 있다.
        int hNum = 0xA; // 0x는 16진수를 의미하며, 앞에 0x를 붙여주면 16진수로 표기할 수 있다.

        System.out.println(n); // 10
        System.out.println(bNum); // 10
        System.out.println(hNum); // 10
    }
}
