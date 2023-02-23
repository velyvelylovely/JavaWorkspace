package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789; // double 변수에 값을 넣을 때는 실숫값 그대로 넣는다. 실수를 값으로 넣을 때는 자동으로 double 로 인식이 된다.
        float f = 3.14123456789F; // float 변수에 값을 넣을 때는 실숫값 뒤에 F,f를 넣는다.
        System.out.println(d);
        System.out.println(f);
        // 값을 출력해보면 d는 모든 값이 잘 나오고, f는 6에서 끊긴다.
        // 정밀한 데이터를 넣을 때는 double 을 사용하고 깊은 소숫점을 넣을 필요가 없을 때는 float 을 사용한다.

        long l = 1_000_000_000_000L; // int 자료형이 가질 수 있는 범위는 -21억부터 +21억 사이의 값이다.
        System.out.println(l);       // int 의 범위를 벗어났을 때는 long 을 사용한다. 그리고 정수 뒤에 L, l을 넣는다.

        // int, long, float, double, char, String, boolean
        // 우리가 사용하려는 데이터에 맞는 적합한 자료형을 사용해야 한다.
        // 작은 범위를 계산하기 위해서 너무 큰 자료형을 사용하게 되면 그만큼 공간이 낭비되고,
        // 큰 범위를 계산해야 되는데 그만큼의 범위를 감당할 수 없는 너무 작은 자료형을 사용하게 되면 올바른 계산이 안된다.
    }
}

