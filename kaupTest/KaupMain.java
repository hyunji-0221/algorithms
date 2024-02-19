package kaupTest;

public class KaupMain {
    //BMI 구하는 프로그램을 작성해주세요.
    //체중 및 신장은 random으로 처리
    //키 150~200, 몸무게 30~99 실수처리(double, 소수점 첫번째까지)
    public static void main(String[] args) {

        System.out.println("체중을 입력하세요 : ");
        double weight = Math.random()*69+30;
        System.out.printf("체중은 : %.1f",weight);
        System.out.println("\n신장을 입력하세요 : ");
        double height = (Math.random()*50+150)*0.01;
        System.out.printf("신장은 : %.1f",height*100);
        double bmi = weight/(height*height);
        System.out.printf("\nBMI는 : %.1f",bmi);
    }
}
