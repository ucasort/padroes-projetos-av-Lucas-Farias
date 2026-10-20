package passagem.rodoviaria;

import passagem.EmissorPassagem;
import passagem.Passagem;

public class EmissorPassagemRodoviaria extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}
