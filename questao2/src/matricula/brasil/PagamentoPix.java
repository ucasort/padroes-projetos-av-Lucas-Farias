package matricula.brasil;

import matricula.Pagamento;

class PagamentoPix implements Pagamento {
    private final double valor;

    PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return String.format("Pix - R$ %.2f processado", valor);
    }
}
