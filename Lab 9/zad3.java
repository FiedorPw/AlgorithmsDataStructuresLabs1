public class Main {
    static int[] columnSum = {1, 2, 1, 1, 1,2,1};
    static int firstRowSum = 4;
    static int secondRowSum = 5;
    static int c = columnSum.length;
    static int macierz[][] = new int[2][c];

    public static void main(String[] args) {
        doubleOneCheck();
        fillingFirstRow();
        fillingSecondRow();
        for (int i = 0; i < c; i++) System.out.print(macierz[0][i] + " ");
        System.out.println();
        for (int i = 0; i < c; i++) System.out.print(macierz[1][i] + " ");
    }

    public static void doubleOneCheck() {
        for (int i = 0; i < c; i++) {
            if (columnSum[i] == 2) {
                macierz[0][i] = 1;
                macierz[1][i] = 1;
                firstRowSum--;
                secondRowSum--;
            }
        }
    }

    public static void fillingFirstRow() {
        for (int i = 0; i < c; i++) {
            if (firstRowSum > 0 && macierz[0][i] != 1){
                firstRowSum--;
                macierz[0][i] = 1;
            }
        }
    }
    public static void fillingSecondRow() {
        for (int i = c-1; i > 0; i--) {
            if (secondRowSum > 0 && macierz[1][i] != 1){
                secondRowSum--;
                macierz[1][i] = 1;
            }
        }
    }
