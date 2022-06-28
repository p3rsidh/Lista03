package lista03A.exercicio01;

import java.awt.font.LineMetrics;
import java.util.Scanner;

public class ImprimirMaior {
    public static void main(String[] args) {
        float valor1, valor2, maior;
        Scanner input = new Scanner(System.in);

        System.out.println("Aqui você pode introduzir dois números, e sera informado o maior");
        System.out.println("Insira o primeiro número");
        valor1 = input.nextFloat();
        System.out.println("Insira o segundo número");
        valor2 = input.nextFloat();
        System.out.println("Processando informações");
        if(valor1 > valor2){
            System.out.println( valor1 +"é o maior numero");
        }else if(valor1 < valor2){
            System.out.println(valor2 +"é o maior");
        } else if (valor1 == valor2){
            System.out.println("Os números são iguais");
        }
    }
}
