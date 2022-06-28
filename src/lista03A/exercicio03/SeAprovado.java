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
        System.out.println("Introduza a primeira nota,  entre 0 e 10");
        nota1 = input.nextFloat();
        System.out.println("Introduza a segunda nota, entre 0 e 10");
        nota2 = input.nextFloat();
        System.out.println("Processando");


        if(nota1 > 10 || nota2 > 10 || nota1 < 0 || nota2 < 0){
            System.out.println("Introduza valores válidos, entre 0 e 10");
        }else {
            media = (nota1 + nota2)/2;
        if (media >= 7){
            if (media == 10){
                System.out.println("Aluno " +nome +" aprovado com Distinção!! Com média 10");
            }else {
                System.out.println("Aluno " +nome + " aprovado com média de " + media);
            }
        }else if( media < 7){
            System.out.println("Aluno " +nome +" reprovado com media de " +media);
        }}
    }
}
