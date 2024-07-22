package org.example;

public class TipoProblemaSupervisor implements TipoProblema {

    private static TipoProblemaSupervisor tipoProblemaSupervisor = new TipoProblemaSupervisor();

    private TipoProblemaSupervisor() {}

    public static TipoProblemaSupervisor getTipoProblemaSupervisor() {
        return tipoProblemaSupervisor;
    }
}
