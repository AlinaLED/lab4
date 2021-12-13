package lab4;



import java.io.IOException;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) throws IOException {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int N = console.nextInt();
        int [] A = new int[N];
        System.out.println("Введите массив:");
        for (int i = 0; i < N; i ++) {
            A[i] = console.nextInt();
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < N; i ++) {
            System.out.println(A[i]);
        }
        System.out.println("Введите число, которое хотите удалить:");
        int X = console.nextInt();
        for (int i = 0; i < N; i ++) {
            if (A[i] == X){
                A[i] = 0;
            }
        }

        System.out.println("Обработанный массив:");

        for (int i = 0; i < N; i ++) {
            System.out.println(A[i]);
        }

        System.in.close();

    }
}








