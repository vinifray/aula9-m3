package com.br.zup;

import java.util.Scanner;

public class Sistema {

    public static void menu(){
        StringBuilder model = new StringBuilder();
        model.append("Digite:\n");
        model.append("1 para pesquisar por email do Consumidor");
        System.out.println(model.toString());
    }

    public static Fatura pesquisarFatura() throws Exception {
        System.out.println("Digite o email");
        String email = new Scanner(System.in).nextLine();
        Fatura fatura = ServicoFatura.pesquisarFaturaPeloEmailDoConsumidor(email);
        return fatura;
    }

}
