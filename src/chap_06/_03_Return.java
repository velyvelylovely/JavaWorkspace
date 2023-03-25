package chap_06;

public class _03_Return {
    // 지금까지 void 라고 적은 것은 반환값이 없는 메소드라는 뜻이다. 값을 반환하기 위해서는 void 위치에 type(반환형태)을 적어준다.

    // 호텔 전화번호
    public static String getPhoneNumber() { // 반환 형태는 String 뿐만 아니라 int, double, float, boolean 도 사용할 수 있다.
        String phoneNumber = "02-1234-5678";
        return phoneNumber; // 반환값은 public static 뒤에 정의한 type 과 같아야 한다.
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }
    // 호텔 액티비티
    public static String getActivities () {
        return "볼링장, 탁구장, 노래방";
    }
    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        // 문자열 변수로 받지 않고 바로 프린트문 내에서 사용하기
        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
