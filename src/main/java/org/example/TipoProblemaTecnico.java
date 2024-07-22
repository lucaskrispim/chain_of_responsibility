package org.example;

public class TipoProblemaTecnico implements TipoProblema {

    private static TipoProblemaTecnico tipoProblemaTecnico = new TipoProblemaTecnico();

    private TipoProblemaTecnico() {}

    public static TipoProblemaTecnico getTipoProblemaTecnico() {
        return tipoProblemaTecnico;
    }
}
