package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4

        for (int i = 2; i < 10; i++) {
            int j = 1;
            System.out.println(i + " * " + j + " = " + ( i * j )); // 2 * 1 = 2
            j++;
            System.out.println(i + " * " + j + " = " + ( i * j )); // 2 * 2 = 4
            j++;
            System.out.println(i + " * " + j + " = " + ( i * j )); // 2 * 3 = 6

            System.out.println();
        }

        System.out.println("---------");

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + ( i * j ));
            }
            System.out.println(); // 각 단이 끝나고 나서 줄바꿈
        }
    }
}
