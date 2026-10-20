package matricula;

public interface FabricaArtefatos {
    DocumentoFiscal criarDocumentoFiscal(double valor);

    Pagamento criarPagamento(double valor);

    ComprovanteMatricula criarComprovante(String aluno, String documentoAluno, String curso);
}
