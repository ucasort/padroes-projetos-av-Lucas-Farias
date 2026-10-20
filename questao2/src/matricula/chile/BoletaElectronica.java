package matricula.chile;

import matricula.DocumentoFiscal;

class BoletaElectronica implements DocumentoFiscal {
    private static final double ALIQUOTA_IVA = 0.19;
    private final double valor;

    BoletaElectronica(double valor) {
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return String.format("Boleta electronica - valor %.2f, IVA (19%%) %.2f", valor, valor * ALIQUOTA_IVA);
    }
}
