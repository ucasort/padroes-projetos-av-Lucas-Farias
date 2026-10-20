package passagem.ferroviaria;

import passagem.EmissorPassagem;
import passagem.Passagem;

public class EmissorPassagemFerroviaria extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemFerroviaria(passageiro, tarifa);
    }
}
