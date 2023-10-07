package exercise3;

import static exercise3.Contador.contarPalavras;

public class Main {
    public static void main(String[] args){

        int numeroPalavras = contarPalavras("O número de palavras dessa frase deve ser contado.");
        System.out.print(numeroPalavras);
    }
}