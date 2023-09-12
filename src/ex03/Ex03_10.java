package ex03;

public class Ex03_10 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        /* a 의 경우 long 타입의 변수에 100만 * 100만을 입력하였기 때문에
         * 1000000000000 으로 출력될 것 같지만,
         * int타입과 int타입의 연산결과는 int이기 때문에 전혀 다른 값이 출력된다.
         * 두 자료형 중 하나라도 int 이상의 자료형으로 형변환 시 원하는 값이 도출된다.
         */
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
