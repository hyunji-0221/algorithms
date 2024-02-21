package matrixTest;

public class Matrix {
    public static void main(String[] args) {
        int[][]mtx = new int[5][5];

        int k = 1;
//역순 가로방향으로 출력하기
        //담기
        for(int i=mtx.length-1;i>=0;i--){
            for(int j=mtx.length-1;j>=0;j--){
                mtx[i][j] = k;
                k++;
            }
        }
        //출력하기
        for(int i=0;i<mtx.length;i++){
            for(int j=0;j<mtx.length;j++){
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
    }
}
