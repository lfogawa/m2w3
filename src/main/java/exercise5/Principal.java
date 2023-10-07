package exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        List<Concurso> lista = new ArrayList<>();
        Path arquivo = Paths.get("src","main","java","exercise5","megasena.txt");
        if (Files.notExists(arquivo))
            System.out.println("Arquivo nao encontrado!!!");

        List<String> linhas = Files.readAllLines(arquivo);

        for(String linha : linhas) {
            String[] split = linha.split(",");

            int numeroConcurso = Integer.parseInt(split[0]);

            String dataString = split[1];  // data como string
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataString, formatador);

            int[] numerosSorteados = new int[6];
            for(int i=0; i<=5; i++) {
                String n = split[i+2];
                numerosSorteados[i] = Integer.parseInt(n);
            }
            Concurso concurso = new Concurso(numeroConcurso, data, numerosSorteados);
            lista.add(concurso);
        }

        lista.forEach(c -> System.out.println(c));

    }
}
