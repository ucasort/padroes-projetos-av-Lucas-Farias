package matricula.chile;

import matricula.Pagamento;

class PagamentoWebpay implements Pagamento {
    private final double valor;

    PagamentoWebpay(double valor) {
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return String.format("Webpay - %.2f processado", valor);
    }
}
