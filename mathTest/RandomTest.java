package mathTest;

public class RandomTest {

    static int returnRandom(){
        int randomNumber = (int)(Math.random()*100);
        System.out.printf("랜덤값 : %d",randomNumber);
        return randomNumber;
    }

    public static void main(String[] args) {
        int randomNumber = returnRandom();
        System.out.println("리턴된 값 : "+randomNumber);
    }
}
