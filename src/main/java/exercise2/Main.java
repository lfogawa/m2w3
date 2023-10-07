package exercise2;

public class Main {
    public static void main(String[] args){

        Funcionario funcionario1 = new Funcionario("João");
        funcionario1.salario = 1000.00F;
        funcionario1.aumentar(150F);
        System.out.printf("O salário aumentado é de %.2f.%n", funcionario1.salario);
        funcionario1.aumentar(150F, 150F);
        System.out.printf("O salário aumentado novamente e com comissão é de %.2f.%n", funcionario1.salario);

        Funcionario funcionario2 = new Funcionario("João", 1000.00F);
        funcionario2.aumentar(150F);
        System.out.printf("O salário aumentado é de %.2f.%n", funcionario2.salario);
        funcionario2.aumentar(150F, 150F);
        System.out.printf("O salário aumentado novamente e com comissão é de %.2f.%n", funcionario2.salario);

    }
}