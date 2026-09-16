package prjWhileLista02;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int baseNum = ler.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = ler.nextInt();

        int resultado = 1;
        int i = 0;

        while (i < expoente) {
            resultado = resultado * baseNum;
            i++;
        }

        System.out.println("Resultado: " + resultado);

        ler.close();
    }
}