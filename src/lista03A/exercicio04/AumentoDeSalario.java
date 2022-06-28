package lista03A.exercicio04;

import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        double salario, aumento, porcentagem, novoSalario;
        Scanner input = new Scanner(System.in);

        System.out.println("Aqui você pode introduzir o valor do salario e receber o valor do aumento");
        System.out.println("Introduza o valor do salario atual");
        salario = input.nextDouble();

        if (salario <= 280){
            aumento = salario * 0.2;
            porcentagem = 20;
            novoSalario = salario + aumento;
            System.out.println("O salario de " +salario +" será reajustado em " +porcentagem +"%" +" sendo o valor do aumento de " +aumento +" passando a ser o salario " +novoSalario);
        } else if (salario > 280 && salario <= 700){
            aumento = salario * 0.15;
            porcentagem = 15;
            novoSalario = salario + aumento;
            System.out.println("O salario de " +salario +" será reajustado em " +porcentagem +"% " +" sendo o valor do aumento de " +aumento +" passando a ser o salario " +novoSalario);
        }else if(salario > 700 && salario <= 1500){
            aumento = salario * 0.1;
            porcentagem = 10;
            novoSalario = salario + aumento;
            System.out.println("O salario de " +salario +" será reajustado em " +porcentagem +"%" +" sendo o valor do aumento de " +aumento +" passando a ser o salario " +novoSalario);
        }else if(salario > 1500){
            aumento = salario * 0.05;
            porcentagem = 5;
            novoSalario = salario + aumento;
            System.out.println("O salario de " +salario +" será reajustado em " +porcentagem +"%" +" sendo o valor do aumento de " +aumento +" passando a ser o salario " +novoSalario);
        }

    }
}
