package ex2;

public class Ex2_09 {
    public static void main(String[] args) {
        String url = "www.java_study.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
        System.out.printf("d=%f%n", d);
        // 전체자리.소수점아래자리
        // %14.10% = 전체자릿수 14자리 중 소수점 10자리까지 표기하라는 의미
        // %014.10% = 전체자릿수 중 빈자리의 또한 0으로 채우라는 의미
        System.out.printf("d=%014.10f$n", d);
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url); // 문자열의 길이만큼 출력공간을 확보
        System.out.printf("[%30s]%n", url); // 최소 30글자 출력공간 확보(우측정렬)
        System.out.printf("[%-30s]%n", url); // 최소 30글자 출력공간 확보(좌측정렬)
        System.out.printf("[%.16s]%n", url); // 왼쪽에서 16글자만 출력
    }
}
