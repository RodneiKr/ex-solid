package org.kr.exsolid.principio05dependencyinversion;

public class AcessoDbExBom {
    private ConexaoDb_ conexaoDb;

    public AcessoDbExBom(final ConexaoDb_ conexaoDb) {
        this.conexaoDb = conexaoDb;
    }
}

interface ConexaoDb_ {
}

class MySqlConexaoDb implements ConexaoDb_ {
}

class OracleConexaoDb implements ConexaoDb_ {
}