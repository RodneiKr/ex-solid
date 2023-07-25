package org.kr.exsolid.principio02openclosed;

import java.math.BigDecimal;

public class FolhaDePagamentoExBom {

    private BigDecimal remuneracao;

    protected void calcularSalario(final Contrato contrato) {
        this.remuneracao = contrato.remuneracao();
    }
    // com a inclusao da interface Contrato poderemos incluir "n" contratos ao sistema
    // sem alterar o metodo calcularSalario
}

interface Contrato {
    BigDecimal remuneracao();
}

class ContratoClt_ implements Contrato {
    @Override
    public BigDecimal remuneracao() {
        return BigDecimal.TEN;
    }
}

class ContratoEstagiario_ implements Contrato {
    @Override
    public BigDecimal remuneracao() {
        return BigDecimal.TWO;
    }
}

class ContratoPj implements Contrato {

    @Override
    public BigDecimal remuneracao() {
        return BigDecimal.TEN;
    }
}