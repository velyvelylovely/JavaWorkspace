package chap_04;

import javax.swing.*;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기
        /*

        *****
        *****
        *****
        *****
        *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------");

        // 별 (*) 왼쪽 삼각형 만들기
        /*

        *
        **
        ***
        ****
        *****

         */
        for (int i = 0; i < 5; i++) {
           // for (int j = 0; j < i + 1; j++) {
            for (int j = 0; j <= i; j++) { // 이렇게 j <= i; 라고 해도 결과는 같다.
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------");

        // 별 (*) 오른쪽 삼각형 만들기
        /*

             *
            **
           ***
          ****
         *****

         SSSS* 이해하기 쉽도록 공백을 S 로 표현
         SSS**
         SS***
         S****
         *****

         */
        for (int i = 0; i < 5; i++) { // 하나의 반복문 안에 두 개의 반복문이 있는 형태
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
