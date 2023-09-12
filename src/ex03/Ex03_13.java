package ex03;

public class Ex03_13 {
    public static void main(String[] args) {
        // 나머지 연산자의 경우 부호는 무시한 절대값으로 계산이 되므로
        // 아래 코드의 전체 결과값은 2로 같다.
        // 부호의 경우 나머지 연산을 한 결과에 왼쪽 피연산자(나눠지는 수)의 부호가 붙는다.
        System.out.println(-10 % 8);
        System.out.println(10 % -8);
        System.out.println(-10 % -8);
    }
}
