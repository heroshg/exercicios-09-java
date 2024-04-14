package exEnums;

public enum Planetas {
    MERCURIO("Mercúrio", 2439.7, 330.2 ),
    VENUS("Vênus", 6051.8, 4868.5),
    TERRRA("Terra", 6371.0, 5973.6),
    MARTE("Marte", 3389.5, 641.85),
    JUPITER("Júpiter", 69.911, 1898.600),
    SATURNO("Saturno", 58.232, 568.460),
    URANO("Urano", 25.362, 86.832),
    Netuno("Netuno", 24.622, 102.430);

    private String nome;
    private double Raio;
    private double Massa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double raio) {
        Raio = raio;
    }

    public double getMassa() {
        return Massa;
    }

    public void setMassa(double massa) {
        Massa = massa;
    }

    Planetas(String nome, double raio, double massa) {
        this.nome = nome;
        Raio = raio;
        Massa = massa;
    }

    public static void buscarPlaneta(String planeta) {
        Planetas planetaBuscado = Planetas.valueOf(planeta.toUpperCase().trim().replace("Ú", "U").replace("Ê", "E"));
        System.out.println("Planeta: " + planetaBuscado.getNome() + ",  Raio: " + planetaBuscado.getRaio() + ",  Massa: " + planetaBuscado.getMassa());
    }
}
