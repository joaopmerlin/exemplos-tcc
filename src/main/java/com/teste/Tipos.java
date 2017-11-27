package com.teste;

public enum Tipos {

    String("string"),
    Long("number");

    private String tipoTs;

    Tipos(String tipoTs) {
        this.tipoTs = tipoTs;
    }

    public java.lang.String getTipoTs() {
        return tipoTs;
    }
}
