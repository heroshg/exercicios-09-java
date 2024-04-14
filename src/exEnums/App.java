package exEnums;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um dia da semana");
//        String texto = sc.nextLine();
//
//        DiaDaSemana.buscarDia(texto);

//        System.out.println("Digite um planeta do sistema solar!");
//        String planeta = sc.nextLine();
//        Planetas.buscarPlaneta(planeta);

//        System.out.println("Digite um número de de 1 a 12 para descobrir a estação de um mês");
//        int mes = sc.nextInt();
//        Estacoes.buscarEstacao(mes);

        System.out.println("Digite um mês do ano!");
        String mes = sc.nextLine();

        Meses.buscarMes(mes);

    }
}
