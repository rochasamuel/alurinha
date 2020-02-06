package br.com.alura.modelo;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome == null) throw new NullPointerException();
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "[ Aluno: " + this.nome + ", Matricula: " + this.matricula + " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula &&
                Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }

    //sempre que dar override no metodo equal dar override també no metodo hashCode



}
