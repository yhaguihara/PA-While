package prjWhileLista02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos termos deseja ver? ");
        int n = ler.nextInt();

        int a = 1;
        int b = 1;
        int proximo;
        int i = 0;

        while (i < n) {
            System.out.print(a + " ");
            proximo = a + b;
            a = b;
            b = proximo;
            i++;
        }

        ler.close();
    }
}