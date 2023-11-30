package Q04;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    public void cadastrarInfor(){
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);
        System.out.println("Ano: " + ano);
    }
    public void displayData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    public String getDataExtenso() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return dia + " de " + meses[mes - 1] + " de " + ano;
    }
}