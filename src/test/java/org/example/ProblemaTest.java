package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProblemaTest {

    SuporteGerente gerente;
    SuporteSupervisor supervisor;
    SuporteTecnico tecnico;
    SuporteAtendente atendente;

    @BeforeEach
    void setUp() {
        gerente = new SuporteGerente(null);
        supervisor = new SuporteSupervisor(gerente);
        tecnico = new SuporteTecnico(supervisor);
        atendente = new SuporteAtendente(tecnico);
    }

    @Test
    void deveRetornarAtendenteParaProblemaSimples() {
        assertEquals("Atendente", atendente.resolverProblema(new Problema(TipoProblemaSimples.getTipoProblemaSimples())));
    }

    @Test
    void deveRetornarSuporteTecnicoParaProblemaTecnico() {
        assertEquals("Suporte Técnico", atendente.resolverProblema(new Problema(TipoProblemaTecnico.getTipoProblemaTecnico())));
    }

    @Test
    void deveRetornarSupervisorParaProblemaSupervisor() {
        assertEquals("Supervisor", atendente.resolverProblema(new Problema(TipoProblemaSupervisor.getTipoProblemaSupervisor())));
    }

    @Test
    void deveRetornarGerenteParaProblemaGerente() {
        assertEquals("Gerente", atendente.resolverProblema(new Problema(TipoProblemaGerente.getTipoProblemaGerente())));
    }

    @Test
    void deveRetornarSemSolucaoParaProblemaNaoDefinido() {
        assertEquals("Sem solução", atendente.resolverProblema(new Problema(new TipoProblema() {})));
    }

    @Test
    void deveLancarExcecaoQuandoTipoProblemaForNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Problema(null);
        });

        String expectedMessage = "Tipo de problema não pode ser nulo";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}