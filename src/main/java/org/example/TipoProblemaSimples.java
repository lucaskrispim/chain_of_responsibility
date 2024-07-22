package org.example;

public class TipoProblemaSimples implements TipoProblema {

    private static TipoProblemaSimples tipoProblemaSimples = new TipoProblemaSimples();

    private TipoProblemaSimples() {}

    public static TipoProblemaSimples getTipoProblemaSimples() {
        return tipoProblemaSimples;
    }
}
