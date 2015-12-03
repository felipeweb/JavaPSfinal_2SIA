package br.com.fiap.modelo;


public class Orcamento {
    private int numeroOrcamento;
    private String cliente;
    private int qtdPequena;
    private int qtdMedia;
    private int qtdGrande;
    private String regiao;
    private double total;

    public Orcamento(int numeroOrcamento, String cliente, int qtdPequena, int qtdMedia, int qtdGrande, String regiao, double total) {
        this.numeroOrcamento = numeroOrcamento;
        this.cliente = cliente;
        this.qtdPequena = qtdPequena;
        this.qtdMedia = qtdMedia;
        this.qtdGrande = qtdGrande;
        this.regiao = regiao;
        this.total = total;
    }

    
    
    public int getNumeroOrcamento() {
        return numeroOrcamento;
    }

    public void setNumeroOrcamento(int numeroOrcamento) {
        this.numeroOrcamento = numeroOrcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getQtdPequena() {
        return qtdPequena;
    }

    public void setQtdPequena(int qtdPequena) {
        this.qtdPequena = qtdPequena;
    }

    public int getQtdMedia() {
        return qtdMedia;
    }

    public void setQtdMedia(int qtdMedia) {
        this.qtdMedia = qtdMedia;
    }

    public int getQtdGrande() {
        return qtdGrande;
    }

    public void setQtdGrande(int qtdGrande) {
        this.qtdGrande = qtdGrande;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}