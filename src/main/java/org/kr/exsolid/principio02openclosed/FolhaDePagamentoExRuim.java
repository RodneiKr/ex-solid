package org.kr.exsolid.principio02openclosed;

import java.math.BigDecimal;

public class FolhaDePagamentoExRuim {

    private BigDecimal salario;

    public void calcularSalario(final Object contrato) {
        if (contrato instanceof ContratoClt) {
            salario = ((ContratoClt) contrato).salario();
        } else if (contrato instanceof ContratoEstagiario) {
            salario = ((ContratoEstagiario) contrato).bolsaAuxilio();
        }
    }
    // neste caso se tivessemos de adicionar um contrato PJ teriamos de acrescentar um IF (acima)
    // estariamos entao violando o principio 2.
}

class ContratoClt {
    public BigDecimal salario() {
        return BigDecimal.TWO;
    }
}

class ContratoEstagiario {
    public BigDecimal bolsaAuxilio() {
        return BigDecimal.ONE;
    }
}