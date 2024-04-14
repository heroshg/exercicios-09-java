package exEnums;

public enum Meses {

    JANEIRO("Janeiro", 31),
    FEVEREIRO("Fevereiro", 28),
    MARCO("Março", 31),
    ABRIL("Abril", 30),
    MAIO("Maio", 31),
    JUNHO("Junho", 30),
    JULHO("Julho", 31),
    AGOSTO("Agosto", 31),
    SETEMBRO("Setembro", 30),
    OUTUBRO("Outubro", 31),
    NOVEMBRO("Novembro", 30),
    DEZEMBRO("Dezembro", 31);

    private String nome;
    private int qtdDias;

    Meses(String nome, int qtdDias) {
        this.nome = nome;
        this.qtdDias = qtdDias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public static void buscarMes(String mes) {
        Meses mesBuscado = Meses.valueOf(mes.trim().toUpperCase().replace("Ç", "C"));
        System.out.println("O mês: " + mesBuscado.getNome() + " tem " + mesBuscado.getQtdDias() + " dias.");
    }

}
