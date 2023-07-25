package org.kr.exsolid.principio05dependencyinversion;

public class AcessoDbExRuim {

    private ConexaoDb conexaoDb;

    public AcessoDbExRuim() {
        this.conexaoDb = new ConexaoDbMySql().getConexao();
    }

}

class ConexaoDb {
}

class ConexaoDbMySql {
    public ConexaoDb getConexao() {
        return new ConexaoDb();
    }
}
