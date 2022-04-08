package com.br.controller;

public class Pagamento extends Endereco{
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Endereco endereco;
    private Formapagamento formadepagamento;

    public Pagamento(int cep, String logradouro, int numero, String complemento, String cidade, String bairro, String estado) {
        super(cep, logradouro, numero, complemento, cidade, bairro, estado);
    }

    public Pagamento(int cep, String logradouro, int numero, String complemento, String cidade, String bairro, String estado, String nome, String email, String telefone, String cpf, Endereco endereco, Formapagamento formadepagamento) {
        super(cep, logradouro, numero, complemento, cidade, bairro, estado);
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.formadepagamento = formadepagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Formapagamento getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(Formapagamento formadepagamento) {
        this.formadepagamento = formadepagamento;
    }
}
