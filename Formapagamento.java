package com.br.controller;

public class Formapagamento {
    private String pix;
    private String boleto;
    private String debito;
    private String credito;

    public Formapagamento(String pix, String boleto, String debito, String credito) {
        this.pix = pix;
        this.boleto = boleto;
        this.debito = debito;
        this.credito = credito;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getDebito() {
        return debito;
    }

    public void setDebito(String debito) {
        this.debito = debito;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}
