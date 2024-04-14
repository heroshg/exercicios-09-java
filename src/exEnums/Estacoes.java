package exEnums;

public enum Estacoes {
    PRIMAVERA,
    VERAO,
    OUTONO,
    INVERNO;

    public static void buscarEstacao(int mes) {
        switch (mes) {
            case 1:
            case 2:
            case 3:
            case 12:
                System.out.println("A estação do mês: " + mes + " é " + Estacoes.VERAO);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("A estação do mês: " + mes + " é " + Estacoes.OUTONO);
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("A estação do mês: " + mes + " é " + Estacoes.INVERNO);
                break;
            case 10:
            case 11:
                System.out.println("A estação do mês: " + mes + " é " + Estacoes.PRIMAVERA);
                break;
        }
    }
}
