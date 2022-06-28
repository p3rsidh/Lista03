package lista03A.exercicio03;

import java.util.Scanner;

public class SeAprovado {
    public static void main(String[] args) {
        float nota1, nota2, media;
        String nome;
        Scanner input = new Scanner(System.in);

        System.out.println("Este programa receberá duas notas de um aluno, calculará a media e informará se o aluno foi aprovado");
        System.out.println("Introduza o nome do aluno");
        nome = input.next();
        System.out.println("Introduza a primeira nota");
        nota1 = input.nextFloat();
        System.out.println("Introduza a segunda nota");
        nota2 = input.nextFloat();
        System.out.println("Processando");
    }
}
