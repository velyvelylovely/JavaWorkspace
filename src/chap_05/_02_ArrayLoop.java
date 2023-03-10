package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------------------");

        // 배열의 길이를 이용한 순회 -> 인덱스 값으로 작업을 처리해야 할 때 사용 ex) 10 명 중에 3 명까지만 커피를 살 때
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------------------");


        // enhanced for (for-each) 반복문 -> 인덱스 값과 상관없이 배열의 모든 요소를 순회할 때 사용
        for (String coffee : coffees) { // coffees 라는 배열에 있는 값들을 순서대로 순회하는데 coffee 라는 이름으로 받아서 사용한다.
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
