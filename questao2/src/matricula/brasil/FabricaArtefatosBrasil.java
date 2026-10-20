package matricula.brasil;

import matricula.ComprovanteMatricula;
import matricula.DocumentoFiscal;
import matricula.FabricaArtefatos;
import matricula.Pagamento;

public class FabricaArtefatosBrasil implements FabricaArtefatos {
    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valor) {
        return new NfsE(valor);
    }

    @Override
    public Pagamento criarPagamento(double valor) {
        return new PagamentoPix(valor);
    }

    @Override
    public ComprovanteMatricula criarComprovante(String aluno, String documentoAluno, String curso) {
        return new ComprovanteMatriculaCpf(aluno, documentoAluno, curso);
    }
}
