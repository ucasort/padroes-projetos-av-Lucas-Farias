package matricula.chile;

import matricula.ComprovanteMatricula;
import matricula.DocumentoFiscal;
import matricula.FabricaArtefatos;
import matricula.Pagamento;

public class FabricaArtefatosChile implements FabricaArtefatos {
    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valor) {
        return new BoletaElectronica(valor);
    }

    @Override
    public Pagamento criarPagamento(double valor) {
        return new PagamentoWebpay(valor);
    }

    @Override
    public ComprovanteMatricula criarComprovante(String aluno, String documentoAluno, String curso) {
        return new ComprovanteMatriculaRut(aluno, documentoAluno, curso);
    }
}
