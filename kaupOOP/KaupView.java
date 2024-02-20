package kaupOOP;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person ps = new Person();

        System.out.println("이름을 입력하세요");
        ps.setName(sc.next());

        System.out.println("========== BMI 계산 ==========");
        System.out.printf("이름 : %s", ps.getName());

        ps.setWeight(ps.createRandomWeight());
        System.out.printf("몸무게는 : %.1f", ps.getWeight());

        ps.setHeight(ps.createRandomHeight());
        System.out.printf("\n키는 : %.1f", ps.getHeight());

        ps.createBMI();
        System.out.printf("\nBMI는 : %.1f", ps.getBmi());

        ps.createBodyMass();
        System.out.printf("\n체지방은 : %s 입니다.\n", ps.getBodyMass());
        System.out.println("========== BMI 계산 ==========");
    }
}
