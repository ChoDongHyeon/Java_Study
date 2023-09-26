package ex06;

public class Ex06_14 {
    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public Ex06_14() {
        System.out.println("생성자");
    }
    public static void main(String[] args) {
        System.out.println("Ex06_14 bt = new Ex06_14(); ");
        Ex06_14 bt = new Ex06_14();

        System.out.println("Ex06_14 bt2 = new Ex06_14(); ");
        Ex06_14 bt2 = new Ex06_14();
    }
}
