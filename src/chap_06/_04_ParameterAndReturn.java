package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number; -> 위 두줄은 이렇게 한 줄로 생략할 수 있다.
    }


    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal); // 2 * 2 = 4

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3 = 9

        retVal = getPowerByExp(3, 3); // 반환 형태가 int 이기 때문에 위에서 정의한 변수를 그대로 사용할 수 있다.
        System.out.println(retVal); // 3 * 3 * 3 = 27

        System.out.println(getPowerByExp(2, 4)); // 변수 없이 사용하는 것도 가능하다.

        System.out.println(getPower(5)); // 5 * 5 = 25
    }
}
