package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화
        s1 = "1234"; // 메모리 안에 "1234" 라는 데이터가 고정되어 있다.
        s2 = "1234"; // 이미 고정되어 있는 "1234" 를 그대로 사용한다. 즉, s1 과 s2 는 똑같은 데이터를 참조하는 것이다.
        System.out.println(s1.equals(s2)); // true -> equals 는 참조하는 데이터의 내용을 비교하는 것이다.
        System.out.println(s1 == s2); // true -> == 는 두 변수의 참조하는 곳이 같은지 비교하는 것이다.

        s1 = new String("1234"); // new String 을 사용하면 s1 과 s2 의 데이터의 내용이 같아보여도 서로 다른 곳을 참조한다.
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true -> s1 과 s2 의 내용이 같기 때문에 true 가 나온다.
        System.out.println(s1 == s2); // false -> 서로 다른 곳을 참조하고 있기 때문에 false 가 나온다.

        new String ("0000");
    }
}
