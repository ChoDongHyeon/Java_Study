package ex06;

public class Ex06_02 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 의 channel값은 " + t1.channel + " 입니다.");
        System.out.println("t2 의 channel값은 " + t2.channel + " 입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을 " + t1.channel + "로 변경하였습니다.");

        System.out.println("t1 의 channel값은 " + t1.channel + " 입니다.");
        System.out.println("t2 의 channel값은 " + t2.channel + " 입니다.");
    }
}