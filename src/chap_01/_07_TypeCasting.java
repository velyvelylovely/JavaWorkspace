package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8; // 정수와 실수의 계산이 실수로 정의된 변수에 들어갈 때는 정수가 자동으로 double 로 변환이 된다.
        System.out.println(score_d); // 93.0 + 98.8 = 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // String 이라는 클래스가 제공해 주는 valueOf 라는 기능을 사용해서 정수 93을 문자열로 바꿔준다.
        s1 = Integer.toString(93); // toString 은 문자열로 변환해 주는 기능
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93"); // "93"이라는 문자를 숫자로 바꾸기
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8"); // 큰따옴표로 감싼 "98.8"이라는 문자열 형태의 값을 Double 클래스가 제공해 주는
        System.out.println(d);                    // parseDouble 이라는 기능을 이용해서 실수로 변환해 준다.
        // 문자열을 숫자로 바꾸려고 할 때는 따옴표 속에 들어가는 데이터가 올바르게 숫자로 들어가 있어야 한다.
    }
}
