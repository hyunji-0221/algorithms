import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc 변수 , sc의 부모 method(식과문을 포함), sc는 식

//        System.out.println("자연수를 입력하세요 : ");
//        int num = sc.nextInt();
//        String num = sc.next();
//
//        System.out.println("입력받은 수는 : "+num+"입니다.");
//        System.out.println("입력받은 수는 : "+num+"입니다.");


//
//        for(int i=0;i<2;i++){ //->메모리(문)
//            System.out.println(sc.next()); //->cpu(식)
//        }

//        for(int i=0;i<2;i++){
//            String num = sc.next();
//            System.out.println(num);
//        }

//        for(int i=0;i<2;i++){
//            System.out.println("자연수를 입력하세요 : ");
//            String num = sc.next();
//            System.out.println(num);
//        }

/**
 * 최적화 문제 중  최대값 구하기
 **/
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오");
        System.out.println("시험에 응시한 학생 수는 몇 명입니까? : ");
        int stuCount = sc.nextInt();
        String[] stuName = new String[stuCount];
        int[] score = new int[stuCount];
        System.out.println("응시한 학생의 이름을 입력하세요 : ");
        for(int i=0;i<stuCount;i++){
            stuName[i] = sc.next();
        }
        System.out.println("점수를 입력하세요 : ");
        int maxScore = 0;
        int index = 0;
        for(int i=0;i<stuCount;i++){
            score[i] = sc.nextInt();

            if(maxScore < score[i]){
                maxScore = score[i];
                index = i;
            }
        }
        System.out.println("1등은 : "+stuName[index]+" 점수는 : "+score[index]);
    }
}
