package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // 5 는 3 보다 크다. -> true (참이면 true, 거짓이면 false)
        System.out.println(5 >= 3); // true
        System.out.println(5 >= 5); // true
        System.out.println(5 >= 7); // false
        System.out.println("-----");
        System.out.println(5 < 3); // false
        System.out.println(5 <= 3); // false
        System.out.println("-----");
        System.out.println(5 == 5); // true
        System.out.println(5 == 3); // false
        System.out.println("-----");
        System.out.println(5 != 5); // 5 는 5 와 같지 않다. -> false
        System.out.println(5 != 3); // 5 는 3 과 같지 않다. -> true
    }
}
