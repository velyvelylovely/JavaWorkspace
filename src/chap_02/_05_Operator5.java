package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결괏값이 들어가는 변수 = (조건) ? (참의 경우 결괏값) : (거짓의 경우 결괏값) -> 조건 결과에 따라 서로 다른 값이 결과 변수에 대입된다.
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max); // 5

        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b); // false

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); // 달라요
    }
}
