package lista03B.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenorMaiorNumero {
    public static void main(String[] args) {
        int menorNumero = 0, maiorNumero = 0;
        List<Integer> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza 10 numeros para saber o menor");

        for(int i=0; i<10; i++) {
            System.out.println("Digite o primeiro numero");
            lista.add(input.nextInt());
            if(lista.get(i) < menorNumero){
                menorNumero = lista.get(i);
            }
            if (lista.get(i) > maiorNumero){
                maiorNumero = lista.get(i);
        }
            System.out.println("O maior numero e: " +maiorNumero);
            System.out.println("O menor numero e :" +menorNumero);
        }
}}
