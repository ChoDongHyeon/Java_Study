package ex04;

public class Ex04_07 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 5; i++) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
        }
    }
}
