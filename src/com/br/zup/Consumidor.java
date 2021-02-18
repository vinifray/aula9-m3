package com.br.zup;

public class Consumidor {
    private String nomeCompleto;
    private String email;

    public Consumidor(String nomeCompleto, String email) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append("Nome: "+ nomeCompleto);
        model.append("\nEmail: "+email);
        return model.toString();
    }
}
