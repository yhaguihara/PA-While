package prjWhileLista02;

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
        double p1, p2, p3, p4, p5;
        int i = 1;

        while (i <= 10) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = ler.nextInt();

            if (idade <= 15) {
                f1++;
            } else if (idade <= 30) {
                f2++;
            } else if (idade <= 45) {
                f3++;
            } else if (idade <= 60) {
                f4++;
            } else {
                f5++;
            }

            i++;
        }

        p1 = (f1 / 10.0) * 100;
        p2 = (f2 / 10.0) * 100;
        p3 = (f3 / 10.0) * 100;
        p4 = (f4 / 10.0) * 100;
        p5 = (f5 / 10.0) * 100;

        System.out.println("--- RESULTADOS ---");
        System.out.println("1ª faixa (Até 15 anos):      " + f1 + " pessoas | " + p1 + "%");
        System.out.println("2ª faixa (16 a 30 anos):     " + f2 + " pessoas | " + p2 + "%");
        System.out.println("3ª faixa (31 a 45 anos):     " + f3 + " pessoas | " + p3 + "%");
        System.out.println("4ª faixa (46 a 60 anos):     " + f4 + " pessoas | " + p4 + "%");
        System.out.println("5ª faixa (Acima de 60 anos): " + f5 + " pessoas | " + p5 + "%");

        ler.close();
    }
}