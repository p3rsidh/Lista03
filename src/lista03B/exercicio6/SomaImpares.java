package lista03B.exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        int inicio, fim, soma = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Mostra soma de numeros pares no seu intervalo");
        System.out.println("Escreva o inicio do intervalo");
        inicio = input.nextInt();
        System.out.println("Escreva o final do intervalo");
        fim = input.nextInt();
        if (inicio < fim){
            for (int i= inicio; i <= fim ; i++){
                if(i % 2 != 0 ){
                    soma = soma + i;
                }
                System.out.println("A soma dos valores é: " +soma);
            }
        }else {
            System.out.println("Intervelo de valores invalido");
        }

    }
}
