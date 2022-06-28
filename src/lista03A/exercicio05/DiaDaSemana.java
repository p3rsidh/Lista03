package lista03A.exercicio05;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        boolean validade=false;

        System.out.println("Aqui você pode introduzir um número e receber o dia correspondente da semana");
        while (validade == false){
            System.out.println("Introduza um valor entre 1 e 7");
            numero = input.nextInt();

            if(numero > 1 && numero < 7){
                validade = true;
            switch (numero) {
                case 1:
                    System.out.println("DOMINGO");
                    break;
                case 2:
                    System.out.println("SEGUNDA");
                    break;
                case 3:
                    System.out.println("TERÇA");
                    break;
                case 4:
                    System.out.println("QUARTA");
                    break;
                case 5:
                    System.out.println("QUINTA");
                    break;
                case 6:
                    System.out.println("SEXTA");
                    break;
                case 7:
                    System.out.println("SABADO");
                    break;

            }}else
                System.out.println("Numero invalido");
        }
    }
}
