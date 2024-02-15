import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 3;

        int[] arr = {1, 2, 3, 4};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//위 코드를 반복문으로 수정하면↓↓
//        for(int i=0;i<=3;i++){
//            System.out.println(arr[i]);
//        }

//배열의 길이 알아내기
        System.out.println("arr의 길이 : "+arr.length);
//arr의 syntax => 인스턴스
//length의 syntax => 인스턴스
//인스턴스 속 인스턴스 => 프로퍼티

        //표준 반복문
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


//1보다 크고 10보다 작은 범위 안 짝수 출력
        for(int i=2;i<=10;i+=2) {
            System.out.println(i);
        }
//if문을 사용해 짝수 출력(2로 나눴을때 나머지가 0일 때)
        for(int i=2;i<=10;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
