package exercise1;

public class Main {
    public static void main(String[] args){

        Funcionario funcionario1 = new Funcionario();
        funcionario1.cpf = 99999999L;
        funcionario1.nome = "João";
        funcionario1.salario = 1000.00;
        funcionario1.promover(15F);
        System.out.print(funcionario1.salario);
    }
}