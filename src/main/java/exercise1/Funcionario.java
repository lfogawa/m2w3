package exercise1;

public class Funcionario {
    public Long cpf;
    public String nome;
    public Double salario;

    public Double promover(Float percentual) {
        salario += (salario * percentual) / 100;
        return salario;
    }
}