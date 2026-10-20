package passagem.ferroviaria;

import java.util.List;

import passagem.Passagem;

class PassagemFerroviaria extends Passagem {
    private static final double PERCENTUAL_TAXA = 0.05;

    PassagemFerroviaria(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public String getModal() {
        return "Ferroviario";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return getTarifa() * PERCENTUAL_TAXA;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Comprovante de reserva");
    }
}
