package passagem.aerea;

import java.util.List;

import passagem.Passagem;

class PassagemAerea extends Passagem {
    private static final double PERCENTUAL_TAXA = 0.08;

    PassagemAerea(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public String getModal() {
        return "Aereo";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return getTarifa() * PERCENTUAL_TAXA;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Bilhete eletronico (e-ticket)");
    }
}
