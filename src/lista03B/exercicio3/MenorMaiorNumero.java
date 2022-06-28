package lista03B.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenorMaiorNumero {
    public static void main(String[] args) {
        int menorNumero , maiorNumero ;
        List<Integer> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza 10 numeros para saber o menor");
        System.out.println("Digite o primeiro numero");
        lista.add(input.nextInt());
        menorNumero = lista.get(0);
        maiorNumero = lista.get(0);
        for (int i = 0; i<9; i++){
            System.out.println("Digite mais um numero");
            lista.add(input.nextInt());
        }
        for(int i=0; i<10; i++) {
            if(lista.get(i) < menorNumero){
                menorNumero = lista.get(i);
            }
            if (lista.get(i) > maiorNumero) {
                maiorNumero = lista.get(i);
            }
        }

        System.out.println("O maior numero e: " +maiorNumero);
        System.out.println("O menor numero e :" +menorNumero);
}}
