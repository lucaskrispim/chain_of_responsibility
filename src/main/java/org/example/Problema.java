package org.example;

public class Problema {

    private TipoProblema tipoProblema;

    public Problema(TipoProblema tipoProblema) {
        if (tipoProblema == null) {
            throw new IllegalArgumentException("Tipo de problema não pode ser nulo");
        }
        setTipoProblema(tipoProblema);
    }

    public TipoProblema getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
}
