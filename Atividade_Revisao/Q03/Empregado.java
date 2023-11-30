package Q03;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }
    public void cadastrar(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Salario Mensal: " + salarioMensal);
    }
    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }
    public void concederAumentoSalarial(double percentualAumento) {
        salarioMensal += salarioMensal * (percentualAumento / 100);
    }
}