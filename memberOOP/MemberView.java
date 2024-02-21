package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scan = new Scanner(System.in);

        System.out.println("ID, 비밀번호, 비밀번호확인, 이름, " +
                            "주민번호, 전화번호, 주소, 직업을 입력하세요 : ");
        Member mem = new Member(scan.next(), scan.next(), scan.next(),scan.next(),
                scan.next(),scan.next(),scan.next(),scan.next());

        System.out.println(mem);
    }
}