import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("첫 번째 숫자를 입력하세요 : ");
        String firstNum = scan.next();
        System.out.printf("두 번째 숫자를 입력하세요 : ");
        String secondNum = scan.next();

        System.out.println("+, -, *, / 중 하나를 입력하세요 : ");
        String opCode = scan.next();
        int result = 0;
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);

        if (opCode.equals("+")) {
            result = num1 + num2;
        } else if (opCode.equals("-")) { // 경우의 수 추가하기
            result = num1 - num2;
        } else if (opCode.equals("*")) {
            result = num1 * num2;
        } else if (opCode.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("잘못된 연산기호 입니다.");
        }

        System.out.println("입력받은 숫자는 : " + firstNum + ", " + secondNum);
        System.out.println("결과는 : " + result);
    }
}