package prjWhile;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        
        while (i <= 6) {
            System.out.println("Usuário " + i);
            System.out.print("Digite o ano de nascimento: ");
            int anoNasc = scanner.nextInt();
            System.out.print("Digite o ano atual: ");
            int anoAtual = scanner.nextInt();
            
            int idade = anoAtual - anoNasc;
            
            if (idade >= 18) {
                System.out.println("Idade: " + idade + " - MAIOR de idade\n");
            } else {
                System.out.println("Idade: " + idade + " - MENOR de idade\n");
            }
            
            i++;
        }
        scanner.close();
    }
}