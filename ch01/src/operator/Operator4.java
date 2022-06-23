package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 복합 대입 연산자
        int num = 10;
        System.out.println(num += 1); // 11
        System.out.println(num); // 11
        System.out.println(num %= 10); // 1
        System.out.println(num); // 1
        num -= 1; // 0
        System.out.println(num); // 0

        // 조건 연산자
        boolean x = (5 > 3) ? true : false; // true
        System.out.println(x); // true
        
        int fatherAge = 45, motherAge = 47;
        char ch; // char는 문자 하나를 저장하는 자료형
        ch = (fatherAge > motherAge) ? 'T' : 'F'; // F
        System.out.println(ch); // F
    }
}
