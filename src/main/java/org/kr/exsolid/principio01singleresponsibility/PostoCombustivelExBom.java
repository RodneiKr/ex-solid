package org.kr.exsolid.principio01singleresponsibility;

public class PostoCombustivelExBom {

    protected void abastecerCombustivel() {

    }

    protected void verificarNivelDoOleo() {

    }

    protected void completarOleo() {

    }

    protected void verificarNivelDoFluidoDeArrefecimento() {

    }

    protected void completarFluidoDeArrefecimento() {

    }

    protected void calibrarPneu() {

    }

    // neste exemplo aplicamos SRP nos metodos.
    // devemos seguir o mesmo conceito para classe, nao poderiamos criar um metodo
    // fora do escopo de posto de combustivel: .getPrevisaoDoTempo()
}
