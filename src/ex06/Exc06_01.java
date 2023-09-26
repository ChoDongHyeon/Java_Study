package ex06;

/**
 * 연습문제 6-1 ~ 6-3 까지 풀이
 */
class Student{
    String name;
    int ban, no, kor, eng, math;

    Student() {

    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return Math.round(((float) getTotal() / 3.0f) * 10) / 10.0f;
    }

    String info(){
        int sum = 0;
        double avg = 0.0;

        sum = kor+eng+math;
        avg = Math.round(((double) sum / 3) * 10) / 10.0;

        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + avg;
    }
}
public class Exc06_01 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.ban = 1;
        s2.no = 1;
        s2.kor = 100;
        s2.eng = 60;
        s2.math = 76;

        System.out.println("이름 : " + s2.name);
        System.out.println("총점 : " + s2.getTotal());
        System.out.println("평균 : " + s2.getAverage());
    }
}
