public class QuestaoUm {
    public static void main(String[] args) {

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println(soma);

        System.out.println("O valor da variável soma é " + soma);

    }
}
