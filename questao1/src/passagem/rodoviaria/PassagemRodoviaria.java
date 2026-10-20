package passagem.rodoviaria;

import java.util.List;

import passagem.Passagem;

class PassagemRodoviaria extends Passagem {
    private static final double PERCENTUAL_TAXA = 0.03;

    PassagemRodoviaria(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public String getModal() {
        return "Rodoviario";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return getTarifa() * PERCENTUAL_TAXA;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto");
    }
}
