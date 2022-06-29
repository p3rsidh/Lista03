package lista03B.exercicio7;

import java.util.Scanner;

public class PrimoNãoPrimo {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza um numero");
        numero = input.nextInt();
        if(numero != 2 && numero != 3){
            if(numero % 2 == 0 || numero % 3 == 0){
            System.out.println("numero não primo");
            }else {
                System.out.println("numero primo");
            }
        }else if(numero == 2 || numero == 3) {
            System.out.println("Numero primo");
        }}
    }

