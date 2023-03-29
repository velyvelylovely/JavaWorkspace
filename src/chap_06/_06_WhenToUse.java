package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2); // 메소드 내에서도 또 다른 메소드를 호출할 수 있다.
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result); // 2 * 2 = 4
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3의 3승을 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result); // 3 * 3 * 3 = 27
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); // 4 * 4 = 16
        System.out.println(getPower(4, 2)); // 4 * 4

        // result 를 1 로 초기화해서 for 문을 통해서 어떤 수를 몇 번 곱해주는 작업을 값만 바꿔서 반복하고 있다.
        // 이렇게 같은 동작을 하는데 값만 다른 경우, 메소드로 만들면 여러번 반복되는 코드의 중복을 줄일 수 있다.
        // 실무에서는 비슷한 동작을 하는 코드들이 여기저기에 나누어져 있으면 어디를 수정해야 하는지 일일히 찾아야하는 불편함이 있다.
        // 그래서 메소드로 만들어서 코드를 간소화하면, 다른 곳에서 메소드를 사용할 때 메소드만 호출하면 되고
        // 수정이 필요하면 메소드 안에 있는 코드만 수정하면 되기 때문에 코드 유지, 보수를 할 때 굉장히 용이하다.
    }
}