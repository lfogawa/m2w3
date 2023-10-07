package exercise3;

public class Contador {
    public static int contarPalavras(String frase){
        String[] palavras = frase.split(" ");
        int numeroPalavras = palavras.length;
        return numeroPalavras;
    }
}
