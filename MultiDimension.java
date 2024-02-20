import java.util.Scanner;

public class MultiDimension {
    static int numOfStu(Scanner sc){
        System.out.println("학생 수를 입력하세요 : ");
        return sc.nextInt();
    }

    static int avgOfClass(int stuCount){
        int avg = 0;
        int[] score = new int[stuCount];
        for(int i=0;i<stuCount;i++){
            score[i] = (int)(Math.random()*100);
            System.out.println(score[i]);
            avg += score[i];
        }
        return avg/stuCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력하세요 : ");
        int stuCount1 = 0;
        int stuCount2 = 0;

        System.out.println("1반 학생의 점수를 입력하세요 : ");
        int avg1 = avgOfClass(stuCount1);

        System.out.println("2반 학생의 점수를 입력하세요 : ");
        int avg2 = avgOfClass(stuCount2);

        System.out.println("1반의 평균 점수는 : "+avg1);
        System.out.println("2반의 평균 점수는 : "+avg2);

    }
}
