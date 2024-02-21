package kaupOOP;

import memberOOP.Member;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member member = new Member((Math.random() * 50 + 150),(Math.random() * 69 + 30));

        KaupService service = new KaupServiceImpl();
        System.out.println("========== BMI 계산 ==========");
        System.out.printf("이름 : %s", member.getName());
        System.out.printf("몸무게는 : %.1f", member.getWeight());
        System.out.printf("\n키는 : %.1f", member.getHeight());

        double bmi = service.createBMI();
        System.out.printf("\nBMI는 : %.1f", bmi);

        String bodyMass = service.createBodyMass();
        System.out.printf("\n체지방은 : %s 입니다.\n", bodyMass);

        System.out.println("========== BMI 계산 ==========");
    }
}
