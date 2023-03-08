package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나"); // 아메리카노 하나
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[4]; // 크기 4 의 연속된 String( 문자열 ) 데이터를 가진 배열을 생성

        // 두 번째 방법
        // String coffees[] = new String[4];
//        coffees[0] = "아메리카노"; // 생성된 배열 안에 0 부터 값을 넣어준다. -> 크기 4 의 배열이 있으면 컴퓨터에서는 배열에 접근할 때 0, 1, 2, 3 으로 접근한다.
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 세 번째 방법
        // 배열 선언과 동시에 값들을 초기화
        // String[] coffees = new String[] { "아메리카노", "카페모카", "라떼", "카푸치노" };

        // 네 번째 방법
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };

        System.out.println("----------------------------------");

        // 커피 주문
        System.out.println(coffees[0] + " 하나"); // 아메리카노 하나 -> coffees[0] 는 접근하려는 배열의 위치( 배열 요소의 인덱스값 )
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소"; // 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");

        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5}; // 배열 안에 들어가는 값들은 앞에 선언된 자료형과 같은 값이 들어가야 한다.
        boolean[] b = {true, true, true};
    }
}
