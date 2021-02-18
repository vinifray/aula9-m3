package com.br.zup;

import java.util.ArrayList;
import java.util.List;

/**
 * classe para gerenciar as faturas do nosso sistema
 */
public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static List<Fatura> pesquisarFaturaPeloEmailDoConsumidor(String email){
        List<Fatura> faturasDoUsuario = new ArrayList<>();
        for (Fatura fatura : faturas){
            if(fatura.getConsumidor().getEmail().equalsIgnoreCase(email)){
                faturasDoUsuario.add(fatura);
            }
        }
        return faturasDoUsuario;
    }

    public static Fatura cadastrarFatura(String email, double valor, String dataVencimento) throws Exception {
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);

        Fatura fatura = new Fatura(consumidor, valor, dataVencimento);
        faturas.add(fatura);

        return fatura;
    }

}
