package chap_03;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        // 해물파전     9000원
        // 김치전      8000원
        // 부추전      8000원
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        // \\ : 역슬래시 출력
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰따옴표 출력
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은따옴표 출력
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요"); // 작은따옴표는 그냥 사용해도 출력된다.

        char c = 'A';
        c = '\''; // 하지만 char 변수 안에 ' 만 넣을 때 ''' 를 쓰면 사용하면 오류가 나기 때문에 \' 를 사용한다.
        System.out.println(c);
    }
}
