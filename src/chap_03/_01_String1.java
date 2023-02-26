package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29 -> 문자열 변수 뒤에 .을 찍으면 사용할 수 있는 기능들이 나온다.

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변경해 주는 기능
        System.out.println(s.toLowerCase()); // 소문자로 변경해 주는 기능

        // 포함 관계
        System.out.println(s.contains("Java")); // 변수 안에 내가 입력한 값이 포함된다면 true
        System.out.println(s.contains("C#"));  // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 내가 입력한 값의 위치 정보 7
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true (아니면 false)
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true (아니면 false)
    }
}
