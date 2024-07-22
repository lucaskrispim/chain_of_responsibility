package org.example;

public class SuporteAtendente extends Suporte {

    public SuporteAtendente(Suporte superior) {
        listaProblemas.add(TipoProblemaSimples.getTipoProblemaSimples());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}

