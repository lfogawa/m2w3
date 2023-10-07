package exercise2;

public class Funcionario {
    public String nome;
    public Float salario;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 0.0F; // Initialize salario to 0
    }

    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Float aumentar(Float aumento) {
        salario += aumento;
        return salario;
    }

    public Float aumentar(Float aumento, Float comissao) {
        salario += aumento + comissao;
        return salario;
    }
}