//Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых
// чисел из отрезка [0;9]. Вывести массив на экран. Преобразовать массив таким образом,
// чтобы на первом месте в каждой строке стоял её наибольший элемент. При этом изменять
// состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
// Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
// а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.
public class Main {

    public static void main(String[] args) {
        int l = 0;
        int n = 0;

        int[][] massiv = new int[6][7];
        for (int i = 0; i < massiv.length; i++) {
            System.out.println();
            int m = 0;

            for (int j = 0; j <= 6; j++) {
                massiv[i][j] = (int) (Math.random() * 10);
                if (m < massiv[i][j]) {
                    m = massiv[i][j];
                    n = j;
                }
                if (j == 6) {
                    l = massiv[i][0];
                    massiv[i][0] = massiv[i][n];
                    massiv[i][n] = l;
                }
                System.out.print(" " + massiv[i][j]);
            }
        }
        System.out.println();
        for (int i = 0; i < massiv.length; i++) {
            System.out.println();
            for (int j = 0; j <= 6; j++) {
                System.out.print(" " + massiv[i][j]);
            }
        }
    }

}
