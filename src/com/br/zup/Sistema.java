package com.br.zup;

import java.util.Scanner;

/**
 * Classe para abastraiar a funcionalidade do sistema.
 *
 */
public class Sistema {

    public static void menu(){
        StringBuilder model = new StringBuilder();
        model.append("Digite:\n");
        model.append("-1 para sair\n");
        model.append("1 para pesquisar por email do Consumidor\n");
        model.append("2 para cadastrar consumidor\n");
        model.append("3 para cadatrar fatura\n");
        System.out.println(model.toString());
    }

    public static Fatura pesquisarFatura() throws Exception {
        System.out.println("Digite o email");
        String email = new Scanner(System.in).nextLine();
        Fatura fatura = ServicoFatura.pesquisarFaturaPeloEmailDoConsumidor(email);
        return fatura;
    }

    public static Consumidor cadastrarConsumidor() throws Exception {
        System.out.println("Digite o nome completo");
        String nomeCompleto = new Scanner(System.in).nextLine();

        System.out.println("Digite o email");
        String email = new Scanner(System.in).nextLine();

        return ServicoConsumidor.cadastrarConsumidor(nomeCompleto, email);
    }

    public static Fatura cadastrarFatura() throws Exception {
        System.out.println("Digite o email do consumidor");
        String email = new Scanner(System.in).nextLine();

        System.out.println("O valor da fatura");
        double valorFatura = new Scanner(System.in).nextDouble();

        System.out.println("Data do vencimento da Fatura");
        String dataVencimento = new Scanner(System.in).nextLine();

        return ServicoFatura.cadastrarFatura(email, valorFatura, dataVencimento);
    }
    public static boolean executar() throws Exception {
        boolean continuar = true;
        while (continuar){
            menu();
            int resposta = new Scanner(System.in).nextInt();
            if(resposta == 1){
                Fatura fatura = pesquisarFatura();
                System.out.println(fatura);
            }else if(resposta == 2){
                Consumidor consumidor = cadastrarConsumidor();
                System.out.println(consumidor);
            }else if (resposta == 3){
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            }
        }
        return continuar;
    }
}
