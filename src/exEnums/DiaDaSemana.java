package exEnums;

public enum DiaDaSemana {

    SEGUNDA(true, "Segunda-Feira"),
    TERCA(true, "Terça-Feira"),
    QUARTA(true, "Quarta-Feira"),
    QUINTA(true, "Quinta-Feira"),
    SEXTA(true, "Sexta-Feira"),
    SABADO(false, "Sábado"),
    DOMINGO(false, "Domingo");
    private String nome;
    private boolean ehUtil;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEhUtil() {
        return ehUtil;
    }

    public void setEhUtil(boolean ehUtil) {
        this.ehUtil = ehUtil;
    }

    DiaDaSemana(boolean ehUtil, String nome) {
        this.ehUtil = ehUtil;
        this.nome = nome;
    }

    public static void buscarDia(String dia) {
       DiaDaSemana diaDaSem = DiaDaSemana.valueOf(dia.trim().toUpperCase().replace("-FEIRA", "").replace(" FEIRA", ""));
        System.out.println("Dia da semana é útil?");
        if(diaDaSem.isEhUtil()) {
            System.out.println("É dia útil");
        } else {
            System.out.println("É fim de semana");
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
