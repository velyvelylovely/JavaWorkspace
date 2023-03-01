package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = true; // 한라봉 에이드
        boolean mangoJuice = true; // 망고 주스

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice){
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if 는 여러번 사용 가능
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice){
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // 필요 없는 경우 else 는 없어도 가능
        hallabongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice){
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        } // 전체 조건을 만족하지 않으면 어떤 문장도 실행되지 않고 그냥 끝난다.
        System.out.println("커피 주문 완료 #3");
    }
}
