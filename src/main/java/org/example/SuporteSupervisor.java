package org.example;

public class SuporteSupervisor extends Suporte {

    public SuporteSupervisor(Suporte superior) {
        listaProblemas.add(TipoProblemaSupervisor.getTipoProblemaSupervisor());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}
