package ex06;

class Data3{
    int x;
}
public class Ex06_08 {
    public static void main(String[] args) {
        /**
         * copy 메서드는 새로운 객체를 생성한 다음, 매개변수로 넘겨받은 객체에 저장된 값을
         * 복사해서 반환한다. 반환하는 값이 Data객체의 주소이므로 반환 타입이 'Data'이다.
         */
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();

        tmp.x = d.x;

        return tmp;
    }
}
