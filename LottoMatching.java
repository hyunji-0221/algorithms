import java.util.Random;
import java.util.Scanner;

/**
 * 로또 발급은 1-8까지 중복없는 숫자 6개. 하나는 구매한 로또.
 * 추가된 로직은 추첨된 로또이다
 * 두 로또의 일치 여부에 따라
 * 다음과 같은 메시지를 추력한다.
 * 단, 구매로또 번호와 추첨로또 번호 모두 같이 출력한다.
 * <p>
 * 1등 6개 맞춤
 * 2등 5개 맞춤
 * 3등 4개 맞춤
 * 4등 3개 맞춤
 * 꽝 2개 이하
 */
public class LottoMatching {
    public static void main(String[] args) {
        IBuyLotto buy = new BuyLotto(); //내번호
        ILottoDraw draw = new LottoDraw(); //추첨번호
        ILottoMatch match = new LottoMatch();

        // 로또 구입
        int[] myLotto = new int[6];
        myLotto=buy.buyLotto(myLotto);

        int[] arr = new int[6];
        arr = draw.createArrayWithoutDuplicates(arr);
        arr = draw.sortAscending(arr);
        draw.printLotto(myLotto);
        draw.printLotto(arr);

        // 구입한 로또와 추첨한 로또의 일치여부 체크
        System.out.println(match.rank(match.findSame(arr,myLotto)));
    }
}

interface IBuyLotto {
    int[] buyLotto(int[] arr);
}

interface ILottoDraw {
    int createRandomNumber(int start, int end);
    int[] createArrayWithoutDuplicates(int[] arr);
    int[] sortAscending(int[] arr);
    void printLotto(int[] arr);
}

interface ILottoMatch {
    int findSame(int[] originLotto, int[] myLotto);

    String rank(int count);
}

class BuyLotto implements IBuyLotto {
    @Override
    public int[] buyLotto(int[] arr) {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}

class LottoDraw implements ILottoDraw {

    @Override
    public void printLotto(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t", arr[i]);
        }
        System.out.println();
    }

    @Override
    public int[] sortAscending(int[] arr) {
        // 버블 정렬이 들어갈 부분
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public int[] createArrayWithoutDuplicates(int[] arr) {
        for (int i = 0; i < 6; i++) {
            int randomNumber = createRandomNumber(1, 45);
            boolean check = false;
            for (int j = 0; j < 6; j++) {
                if (arr[j] == randomNumber) {
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if (check == false) {
                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            } else {
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }
        return arr;
    }

    @Override
    public int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }

}

class LottoMatch implements ILottoMatch {
    @Override
    public int findSame(int[] originLotto, int[] myLotto) {
        int count = 0;
        for (int i = 0; i < myLotto.length; i++) {
            for (int j = 0; j < originLotto.length; j++) {
                if (myLotto[i] == originLotto[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String rank(int count) {
        switch (count) {
            case 6:
                return "1등 6개";
            case 5:
                return "2등 5개";
            case 4:
                return "3등 4개";
            case 3:
                return "4등 3개";
            default:
                return "꽝 2개이하";
        }
    }

}