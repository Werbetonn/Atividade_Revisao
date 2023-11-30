package Q02;

public class Fatura {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Fatura(String codigo, String descricao, int quantidade, double precoItem) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }
    public void cadastrar() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço por item: " + precoItem);
    }
    public double totalFatura() {
        return quantidade * precoItem;
    }
}