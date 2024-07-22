package org.example;

public class SuporteTecnico extends Suporte {

    public SuporteTecnico(Suporte superior) {
        listaProblemas.add(TipoProblemaTecnico.getTipoProblemaTecnico());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte Técnico";
    }
}

