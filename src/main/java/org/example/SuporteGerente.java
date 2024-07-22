package org.example;

public class SuporteGerente extends Suporte {

    public SuporteGerente(Suporte superior) {
        listaProblemas.add(TipoProblemaGerente.getTipoProblemaGerente());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}

