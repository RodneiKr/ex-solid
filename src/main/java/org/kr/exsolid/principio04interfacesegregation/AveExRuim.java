package org.kr.exsolid.principio04interfacesegregation;

public interface AveExRuim {
    void setLocalizacao(final String logitude, final String latitude);
    void setAltitude(final String altitude);
    void renderizar();
}

class Papagaio implements AveExRuim {

    @Override
    public void setLocalizacao(String logitude, String latitude) {
        // metodo se aplica ao PAPAGAIO
    }

    @Override
    public void setAltitude(String altitude) {
        // metodo se aplica ao PAPAGAIO
    }

    @Override
    public void renderizar() {
        // faz algo
    }
}

class Pinguim implements AveExRuim {

    @Override
    public void setLocalizacao(String logitude, String latitude) {
        // metodo se aplica ao PINGUIM
    }

    @Override
    public void setAltitude(String altitude) {
        // metodo NAO SE APLICA ao PINGUIM
    }

    @Override
    public void renderizar() {
        // faz algo
    }
}