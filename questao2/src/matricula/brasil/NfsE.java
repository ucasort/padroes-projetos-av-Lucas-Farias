package matricula.brasil;

import matricula.DocumentoFiscal;

class NfsE implements DocumentoFiscal {
    private static final double ALIQUOTA_ISS = 0.05;
    private final double valor;

    NfsE(double valor) {
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return String.format("NFS-e - valor R$ %.2f, ISS (5%%) R$ %.2f", valor, valor * ALIQUOTA_ISS);
    }
}
