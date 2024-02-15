import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scan = new Scanner(System.in);


        System.out.printf("ID : ");
        String id = scan.next();


        System.out.printf("비 번 : ");
        String pw = scan.next();
        System.out.printf("비번확인 : ");
        String pwCheck = scan.next();
        System.out.printf("이름 : ");
        String name = scan.next();
        System.out.printf("주민번호 : ");
        String rrn = scan.next();
        System.out.printf("전화번호 : ");
        String pNum = scan.next();
        System.out.printf("주소 : ");
        String addr = scan.next();
        System.out.printf("직업 : ");
        String job = scan.next();

        System.out.println("아이디:"+id);
        System.out.println("비밀번호:"+pw);
        System.out.println("비번확인:"+pwCheck);
        System.out.println("이름:"+name);
        System.out.println("주민번호:"+rrn);
        System.out.println("전화번호:"+pNum);
        System.out.println("주소:"+addr);
        System.out.println("직업:" + job);
    }
}