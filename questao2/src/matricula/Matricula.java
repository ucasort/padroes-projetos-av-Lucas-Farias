package matricula;

public class Matricula {
    private final FabricaArtefatos fabrica;

    public Matricula(FabricaArtefatos fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(String aluno, String documentoAluno, String curso, double valor) {
        DocumentoFiscal documentoFiscal = fabrica.criarDocumentoFiscal(valor);
        Pagamento pagamento = fabrica.criarPagamento(valor);
        ComprovanteMatricula comprovante = fabrica.criarComprovante(aluno, documentoAluno, curso);

        System.out.println("===== Relatorio da matricula =====");
        System.out.println("Documento fiscal: " + documentoFiscal.descrever());
        System.out.println("Pagamento: " + pagamento.descrever());
        System.out.println("Comprovante: " + comprovante.descrever());
        System.out.println();
    }
}
