package lista03B.exercicio9;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero;
        double soma;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o numero a ser calculado o fatorial");
        numero = input.nextInt();
        soma = numero;
     while (numero > 2){
         soma = soma * (numero -1);
         numero--;
         System.out.println(soma);
     }

    }
}
