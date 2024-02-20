package gradeOOP;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();

        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        grade.setName(sc.next());

        grade.setKor(grade.createRandomScore());

        grade.setEng(grade.createRandomScore());

        grade.setMath(grade.createRandomScore());

        System.out.println("평균 점수를 구하시오");


        System.out.println("============== 성적표 ==============");
        System.out.println("이름 : "+grade.getName());
        System.out.println("국어점수 : "+grade.getKor());
        System.out.println("영어점수 : "+grade.getEng());
        System.out.println("수학점수 : "+grade.getMath());
        grade.createAvg();
        System.out.printf("평균점수 : %.1f",grade.getAvg());

    }
}