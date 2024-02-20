package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scan = new Scanner(System.in);
        Member mem = new Member();

        System.out.println("ID : ");
        mem.setUserName(scan.next());

        System.out.println("비 번 : ");
        mem.setPassword(scan.next());

        System.out.println("비번확인 : ");
        mem.setPasswordCheck(scan.next());

        System.out.println("이름 : ");
        mem.setName(scan.next());

        System.out.println("주민번호 : ");
        mem.setRrn(scan.next());

        System.out.println("전화번호 : ");
        mem.setPNum(scan.next());

        System.out.println("주소 : ");
        mem.setAddress(scan.next());

        System.out.println("직업 : ");
        mem.setJob(scan.next());

        System.out.println("아이디:" + mem.getUserName());
        System.out.println("비밀번호:" + mem.getPassword());
        System.out.println("비번확인:" + mem.getPasswordCheck());
        System.out.println("이름:" + mem.getName());
        System.out.println("주민번호:" + mem.getRrn());
        System.out.println("전화번호:" + mem.getPNum());
        System.out.println("주소:" + mem.getAddress());
        System.out.println("직업:" + mem.getJob());
    }
}