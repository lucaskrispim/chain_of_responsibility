package org.example;

import java.util.ArrayList;

public abstract class Suporte {

    protected ArrayList<TipoProblema> listaProblemas = new ArrayList<>();
    private Suporte suporteSuperior;

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getDescricaoCargo();

    public String resolverProblema(Problema problema) {
        if (listaProblemas.contains(problema.getTipoProblema())) {
            return getDescricaoCargo();
        } else {
            if (suporteSuperior != null) {
                return suporteSuperior.resolverProblema(problema);
            } else {
                return "Sem solução";
            }
        }
    }
}

