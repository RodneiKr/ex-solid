package org.kr.exsolid.principio04interfacesegregation;

public interface AveExBom {
    void setLocalizacao(final String logitude, final String latitude);
    void renderizar();
}

interface AveQueVoa extends AveExBom {
    void setAltitude();
}

class Papagaio_ implements AveQueVoa {

    @Override
    public void setLocalizacao(String logitude, String latitude) {
        // metodo se aplica ao PAPAGAIO
    }

    @Override
    public void renderizar() {
        // metodo se aplica ao PAPAGAIO
    }

    @Override
    public void setAltitude() {
        // metodo se aplica ao PAPAGAIO
    }
}

class Pinguim_ implements AveExBom {

    @Override
    public void setLocalizacao(String logitude, String latitude) {
        // metodo se aplica ao PINGUIM
    }

    @Override
    public void renderizar() {
        // metodo se aplica ao PINGUIM
    }
}