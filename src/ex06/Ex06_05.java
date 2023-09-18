package ex06;

public class Ex06_05 {
    public static void main(String[] args) {
        /**
         * 호출 스택과 관련
         * 컴파일 실행 시 JVM에서 main메서드를 호출하게되며 프로그램이 시작
         * main 메서드 실행 > 현재 println 메서드가 main 메서드 안에 존재하므로
         * println 메서드를 실행 > 화면에 "Hello" 출력
         * println 호출스택에서 제거 > main 메서드로 이동 > println 다음의 문장을 실행
         * 현재는 println 다음 수행할 코드가 없으므로 호출스택은 완전히 비워지게 되고 프로그램은 종료
         */
        System.out.println("Hello");
    }
}
