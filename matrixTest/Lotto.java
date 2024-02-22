package matrixTest;

public class Lotto {
    public static void main(String[] args) {
        int[] arr = new int[6];

        boolean flag = true;
        while (flag) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 45 + 1);
            }
            boolean check = true;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        check=false;
                    }
                }
            }
            if(check){
                flag=false;
            }
        }


        //버블정렬 오름차순
        for (int k = arr.length - 1; k > 0; k--) {
            for (int j = 0; j < k; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
