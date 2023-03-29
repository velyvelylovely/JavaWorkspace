package chap_06;

public class _05_Overloading {
    // 이름이 전부 다른 메소드들을 같은 이름으로 바꿔서 실행해 보자.
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number; -> 위 두줄은 이렇게 한 줄로 생략할 수 있다.
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 개수가 다르거나
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16

        // 지금은 문자열 형태를 출력했는데 문자열 말고도 다른 타입을 사용할 수 있다.
        // 그때마다 서로 다른 메소드 이름으로 만들면 메소드를 호출할 때, 어떤 메소드를 사용할지 혼란이 올 수 있다.
        // 그럴 떄 메소드 오버로딩을 사용하면 된다.
        // 메소드 이름을 똑같이 하고 실행해 보면, 잘 실행되는 것을 확인할 수 있다.
        // 메소드 오버로딩은 전달값의 타입이 다르거나, 전달값의 자료형이 다르거나, 전달값의 개수가 다르면
        // 똑같은 이름의 메소드를 얼마든지 중복해서 선언할 수 있다.
        // 참고로 반환형이 다른 형태로는 중복 정의할 수 없다.

        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 이런 식으로 똑같은 이름의 메소드를 여러 번 중복해서 쓰는 것을 메소드 오버로딩이라고 한다.
    }
}
