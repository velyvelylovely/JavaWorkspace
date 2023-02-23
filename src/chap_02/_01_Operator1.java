package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 -> 원래 값은 2.5 지만 뒤에 있는 소수점은 버려지고 정수로 결과가 나온다.
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0 -> % 연산자는 4를 2로 나누었을 때 나머지가 나온다.
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6 -> 곱하기 연산이 먼저된다.
        System.out.println((2 + 2) * 2); // 8 -> 괄호를 사용하면 괄호 안에 있는 연산이 먼저된다.
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0
    }
}
