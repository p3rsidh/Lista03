package lista03B.exercicio8;

public class SomaImpares {
    public static void main(String[] args) {
        int soma = 0, i = 0, quantidade=0;
        boolean numeros = false;

        while (numeros == false){
            i++;
            if (i%2 != 0){
                soma = soma + i;
                quantidade++;
                if (quantidade == 50){
                    numeros = true;
                }
            }
        }
        System.out.println("A soma dos numeros e: " +soma);
    }
}
