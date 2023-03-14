package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        // 2 차원 배열을 순회할 때는 이중 반복문으로 접근할 수 있다.

        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로
            for (int j = 0; j < 5; j++) { // 가로
                System.out.print(seats[i][j] + " "); // A1 A2 A3...
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) { // seats2.length 는 배열 seats2 중괄호 안의 갯수 3 이다.
            for (int j = 0; j < seats2[i].length; j++) { // seats2[0] 인덱스에 해당하는 length 는 3, [1] 은 4, [2] 는 5 이다.
                System.out.print(seats2[i][j] + " "); // A1 A2 A3...
            }
            System.out.println();
        }
    }
}
