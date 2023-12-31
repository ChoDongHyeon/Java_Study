package ex06;

class Data{
    int x;
}
public class Ex06_06 {
    public static void main(String[] args) {
        /**
         * 1. change 메서드가 호출되면서 'd.x'가 change 메서드의 매개변수 x에 복사됨
         * 2. change 메서드에서 x의 값을 1000으로 변경
         * 3. change 메서드가 종료되면서 매개변수 x는 스택에서 제거됨
         *
         * result. 기본형 매개변수는 변수에 저장된 값만 읽을 수 있을 뿐 변경은 불가능하다.
         */
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
