package com.example.CadastroDeNinjas.Missoes;

public enum Dificuldade {
    D("Baixo", 2),
    C("Moderado", 3),
    B("Difícil", 5),
    A("Altíssimo", 12);

    private String descricao;
    private int dificuldade;

    Dificuldade(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
