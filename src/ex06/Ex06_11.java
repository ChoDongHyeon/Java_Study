package ex06;

class Data_1{
    int value;
}

class Data_2{
    int value;

    Data_2(int x) {
        value = x;
    }
}
public class Ex06_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        /**
         * 컴파일 에러 발생
         * Default 생성자 외에 생성자를 선언하였기 때문에
         * Default 생성자가 없는 상황에서 Default 생성자를 호출하기에
         * 오류가 난다.
         *
         * 해당 구문의 오류를 없애려면 Data_2 Class에 Default 생성자를 만들어주거나
         * 선언부에서 매개변수를 입력해 주면된다.
         */
//        Data_2 d2 = new Data_2();
    }
}
