package passagem.aerea;

import passagem.EmissorPassagem;
import passagem.Passagem;

public class EmissorPassagemAerea extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemAerea(passageiro, tarifa);
    }
}
