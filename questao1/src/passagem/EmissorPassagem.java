package passagem;

public abstract class EmissorPassagem {

    protected abstract Passagem criarPassagem(String passageiro, double tarifa);

    public final Passagem emitir(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);
        double taxa = passagem.calcularTaxaEmbarque();
        imprimirResumo(passagem, taxa);
        return passagem;
    }

    private void imprimirResumo(Passagem passagem, double taxa) {
        System.out.println("===== Resumo da emissao =====");
        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Passageiro: " + passagem.getPassageiro());
        System.out.printf("Taxa de embarque: R$ %.2f%n", taxa);
        System.out.println("Documentos exigidos: " + String.join(", ", passagem.getDocumentosExigidos()));
        System.out.println();
    }
}
