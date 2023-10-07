package exercise4;

public class Main {
    public static void main(String[] args) {
        Contador2 contador = new Contador2("Esta é uma frase de exemplo para contar palavras.");
        int numeroDePalavras = contador.contarPalavras();
        System.out.println("Número de palavras na frase: " + numeroDePalavras);
    }
}