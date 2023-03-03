package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" ---- 반복문 #1 ---- ");

        // 키가 엄청나게 큰 사람?
        move = 0;
        height = 25; // 키가 25m
        while (move + height < distance){ // 처음부터 조건이 거짓이어서 반복문 안의 문장은 실행되지 않고 바로 반복문을 벗어나게 된다.
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" ---- 반복문 #2 ---- ");

        // Do While 반복문
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
        // While 문은 조건을 먼저 보고 조건이 참이면 반복문 안에 있는 문장을 실행한다.
        // Do While 문은 조건은 상관없이 일단 문장을 수행하고 나서 조건을 확인한 다음 계속 반복할지를 결정한다. 그래서 최소 한 번은 Do 영역을 실행한다.
    }
}
