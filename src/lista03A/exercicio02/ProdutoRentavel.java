package lista03A.exercicio02;

import java.util.Scanner;

public class ProdutoRentavel {
    public static void main(String[] args) {
        float produto1, produto2, produto3;
        Scanner input = new Scanner(System.in);

        System.out.println("Aqui voce pode informar o pre�o de 3 produtos, e receber� qual � o mais barato");
        System.out.println("Informe o valor do primeiro produto");
        produto1 = input.nextFloat();
        System.out.println("Informe o valor do segundo produto");
        produto2 = input.nextFloat();
        System.out.println("Informe o valor do terceiro produto");
        produto3 = input.nextFloat();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("O primeiro produto é o mais barato, custando " + produto1);
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("O segundo produto é o mais barato custando " + produto2);
        } else if (produto3 < produto1 && produto3 < produto2) {
            System.out.println("O terceiro produto é o mais barato, custando " + produto3);
        } else if (produto1 == produto2 && produto2 == produto3) {                            //Se o 1 é igual ao 2, e o 2 é igual ao 3, automaticamente o 1 é igual ao 3.
            System.out.println("Os produtos tem o mesmo valor, custando " + produto1);
        }
    }
}
