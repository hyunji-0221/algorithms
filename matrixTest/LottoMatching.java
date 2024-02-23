package matrixTest;

import java.util.Random;

/**
 * 로또 발급은 1-8까지 중복없는 숫자 6개. 하나는 구매한 로또.
 * 추가된 로직은 추첨된 로또이다
 * 두 로또의 일치 여부에 따라
 * 다음과 같은 메시지를 추력한다.
 * 단, 구매로또 번호와 추첨로또 번호 모두 같이 출력한다.

 * 1등 6개 맞춤
 * 2등 5개 맞춤
 * 3등 4개 맞춤
 * 4등 3개 맞춤
 * 꽝 2개 이하
 */
public class LottoMatching {
    public static void main(String[] args) {
        int[] purchaseLotto = new int[6];
        int[] raffleLotto = new int[6];
        purchaseLotto = createLottoNumber(purchaseLotto);
        raffleLotto = createLottoNumber(raffleLotto);

        int count = compareLotto(purchaseLotto, raffleLotto);

        String result = printResult(count);
        printLottoNumber(purchaseLotto);
        printLottoNumber(raffleLotto);
        System.out.println(result+" 맞춤");
    }

    private static void printLottoNumber(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    private static String printResult(int count) {
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

    private static int compareLotto(int[] purchaseLotto, int[] raffleLotto) {
        int count = 0;
        for (int i = 0; i < purchaseLotto.length; i++) {
            for (int j = 0; j < raffleLotto.length; j++) {
                if (purchaseLotto[i] == raffleLotto[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private static int[] createLottoNumber(int[] arr) {
        arr = createArrayWithoutDuplicates(arr);
        // 오름차순 정렬
        arr = sortAscending(arr);

        return arr;
    }

    private static int[] sortAscending(int[] arr) {
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

    private static int[] createArrayWithoutDuplicates(int[] arr) {
        for (int i = 0; i < 6; i++) {
            int randomNumber = createRandomNumber(1, 8);
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

    private static int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }

}
