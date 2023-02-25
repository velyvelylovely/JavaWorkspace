package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num + 2;
        System.out.println(num); // 12

        num = num - 2;
        System.out.println(num); // 10

        num = num * 2;
        System.out.println(num); // 20

        num = num / 2;
        System.out.println(num); // 10

        num = num % 2;
        System.out.println(num); // 0

        // 복합 대입 연산자
        num = 10;
        // num = num + 2;
        num += 2; // 똑같은 변수를 사용해서 그 변수의 연산한 값을 다시 자기 자신에게 넣을 때는 이렇게 사용할 수 있다.
        System.out.println(num); // 12

        // num = num - 2;
        num -= 2;
        System.out.println(num); // 10

        // num = num * 2;
        num *= 2;
        System.out.println(num); // 20

        // num = num / 2;
        num /= 2;
        System.out.println(num); // 10

        // num = num % 2;
        num %= 2;
        System.out.println(num); // 0
    }
}
