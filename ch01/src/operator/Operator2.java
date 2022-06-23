package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 증가, 감소 연산자
        int num = 10;
        int val = 0;

        // val = num++; // 후치 연산자
        val = ++num; // 전치 연산자
        System.out.println(val); // 10인 이유는 증가 연산자가 적용되기 전의 값을 반환하므로 10이 반환된다.
        System.out.println(num); // 11인 이유는 증가 연산자가 적용된 후의 값을 반환하므로 11이 반환된다.

        val = num--; // 후치 연산자. 결과값 : 10
        // val = --num; // 전치 연산자. 결과값 : 11
        System.out.println(val); // 11인 이유는 감소 연산자가 적용되기 전의 값을 반환하므로
        System.out.println(num); // 10인 이유는 감소 연산자가 적용된 후의 값을 반환하므로

        // 산술 연산자 - 총점과 평균
        int mathScore = 90, engScore= 75;
        int totalScore = 0;
        double avgScore = 0.0;

        // 총점
        totalScore = mathScore + engScore;
        // 평균
        // avgScore = (double)totalScore / 2; // 강제 형변환
        avgScore = totalScore / 2.0; // 자동 형변환
        System.out.println(totalScore); // 165
        System.out.println(avgScore); // 82.5
     }
}
