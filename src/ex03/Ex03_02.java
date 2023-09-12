package ex03;

public class Ex03_02 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        // 후위형 = 변수의 값을 먼저 저장한 후 증가시킴
        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);

        i = 5;
        j = 0;

        // 전위형 = 변수의 값을 먼저 증가시킨 후 저장함
        j = ++i;
        System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
    }
}
