import java.util.Scanner;

public class QuestaoDois {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        int numeroAntigo = 0;
        int resultado = 1;

        //if (numero == 0) System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        
        for (; resultado <= numero;) {
            int soma = resultado + numeroAntigo;
            numeroAntigo = resultado;
            resultado = soma;
        }

        if (numero == numeroAntigo) System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
            else System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");

        entrada.close();

    }
    
}
