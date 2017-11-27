package com.teste;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private String nome;
    private List<Atribute> atributes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atribute> getAtributes() {
        return atributes;
    }

    public void setAtributes(List<Atribute> atributes) {
        this.atributes = atributes;
    }

    public void addAtribute(Atribute atribute) {
        if (this.atributes == null) {
            this.atributes = new ArrayList<>();
        }
        this.atributes.add(atribute);
    }

    @Override
    public String toString() {
        return "Model{" +
                "nome='" + nome + '\'' +
                ", atributes=" + atributes +
                '}';
    }
}
