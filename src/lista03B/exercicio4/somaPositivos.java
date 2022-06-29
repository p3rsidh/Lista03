package lista03B.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class somaPositivos {
    public static void main(String[] args) {
        boolean repetir = false;
        int inserir;
        float soma = 0;
        List<Float> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Somaremos numeros positivos");

        while (repetir == false){
            System.out.println("Deseja inserir um numero? Digite 1 para sim e 2 para não");
            inserir = input.nextInt();
            if (inserir == 1){
                float numero;
                System.out.println("Digite um numero positivo");
                numero = input.nextFloat();
                if (numero > 0){
                    lista.add(numero);
                }else {
                    System.out.println("Valor deve ser positivo");
                }
            } else if (inserir == 2){
                for (int i = 0 ; i< lista.size(); i++){
                    soma = soma + lista.get(i);
                }
                System.out.println("A soma é : " +soma);
                repetir = true;
            }
        }
    }
}
