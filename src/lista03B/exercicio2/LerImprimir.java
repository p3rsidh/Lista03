package lista03B.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerImprimir {
    public static void main(String[] args) {
        boolean validade = false;
        int  introduzir;
        List<Integer> lista = new ArrayList<>();
        float total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Vamos ler quantos numeros voce quiser e dar a media");

        while (validade == false){
            System.out.println("Deseja incluir um numero? Digite 1 para sim e 2 para não");
            introduzir = input.nextInt();
            if(introduzir == 1){
                int numero;
                System.out.println("Digite o numero a ser inserido: ");
                numero = input.nextInt();
                lista.add(numero);
                total = total + numero;
                System.out.println("Soma dos numeros inseridos: " +total);

            } else if (introduzir == 2){
                float media = total / lista.size();
                System.out.println("A media dos numeros introduzidos é " +media);
                validade = true;
            } else{
            System.out.println("Opção invalida");
            }
        }
    }
}
