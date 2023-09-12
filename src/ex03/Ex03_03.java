package ex03;

public class Ex03_03 {
    public static void main(String[] args) {
        int i = 5, j = 5;

        // 후위형 : 값을 먼저 표현 후 증가시킴, 결과값 : 5가 출력됨
        System.out.println(i++);
        // 전위형 : 값을 먼저 증가시킨 후 표기, 결과값 : 6이 출력됨
        System.out.println(++j);
        System.out.println("i = " + i + ", j = " + j);
    }
}
