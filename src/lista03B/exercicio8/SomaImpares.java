package lista03B.exercicio8;

public class SomaImpares {
    public static void main(String[] args) {
        int soma = 0, i = 0;
        boolean numeros = false;

        while (numeros == false){
            i++;
            if (i%2 != 0){
                soma = soma + i;
            }
            System.out.println(soma);
        }
    }
}
