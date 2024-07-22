package org.example;

public class TipoProblemaGerente implements TipoProblema {

    private static TipoProblemaGerente tipoProblemaGerente = new TipoProblemaGerente();

    private TipoProblemaGerente() {}

    public static TipoProblemaGerente getTipoProblemaGerente() {
        return tipoProblemaGerente;
    }
}
