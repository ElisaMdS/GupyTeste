import java.util.Scanner;

public class QuestaoCinco {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String frase = entrada.nextLine();

        char letras [] = frase.toCharArray();

        char [] invertido = new char [letras.length];

        int contadorInvertido = 0;

        for (int contadorLetras = letras.length - 1; contadorLetras >= 0; contadorLetras--) {
            
            invertido[contadorInvertido] = letras[contadorLetras]; 
            contadorInvertido++;
        }

     invertido.toString();
     System.out.println(invertido);

     entrada.close();

    }   
}
