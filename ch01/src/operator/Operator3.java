package operator;

public class Operator3 {
    public static void main(String[] args) {
        // 비교, 논리 연산자
        System.out.println(7 < 4); // false
        System.out.println(7 >= 4); // true
        System.out.println(7 == 4); // false
        System.out.println(7 != 4); // true

        // 논리 연산자
        System.out.println((7 > 4) && (7 == 4)); // false
        System.out.println((7 > 4) || (7 == 4)); // true 단락 회로
        System.out.println(!(7 > 4)); // false 논리 부정

        // 단락 회로 예제
        // &&(논리곱)인 경우 - 앞 조건이 거짓이면 뒤 조건은 연산하지 않고 바로 거짓을 리턴
        // ||(논리합)인 경우 - 앞 조건이 거짓이어도 뒤 조건을 연산한다.
        int n = 10, i = 2;
        boolean x = ((n+=10) < 10) && ((i+=2) < 10); // true
        System.out.println(x); // false
        System.out.println(n); // 20
        System.out.println(i); // 4가 아닌 2인 이유는 앞에서 이미 false로 반환되었기 때문에 뒤의 조건은 실행되지 않는다.

        boolean y = ((n+=10) < 10) || ((i+=2) < 10); // true
        System.out.println(y); // true
        System.out.println(n); // 20
        System.out.println(i); // 4가 아닌 2인 이유는 앞에서 이미 true로 반환되었기 때문에 뒤의 조건은 실행되지 않는다.

    }
}
