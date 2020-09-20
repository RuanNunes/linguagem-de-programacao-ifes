package com.medico.model;

public abstract class MedicoAbstract {
    private String nome;
    private Integer idade;
    private boolean aposentado;
    private Integer tempoDeServico;

    abstract void fazerSerurgia();
    abstract void aposentar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public boolean isAposentado() {
        return aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }

    public Integer getTempoDeServico() {
        return tempoDeServico;
    }

    public void setTempoDeServico(Integer tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }
}
