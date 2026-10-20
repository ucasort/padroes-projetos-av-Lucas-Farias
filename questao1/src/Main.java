import java.util.List;

import passagem.EmissorPassagem;
import passagem.aerea.EmissorPassagemAerea;
import passagem.ferroviaria.EmissorPassagemFerroviaria;
import passagem.rodoviaria.EmissorPassagemRodoviaria;

public class Main {
    public static void main(String[] args) {
        List<EmissorPassagem> emissores = List.of(
                new EmissorPassagemAerea(),
                new EmissorPassagemRodoviaria(),
                new EmissorPassagemFerroviaria());

        String[] passageiros = {"Ana Souza", "Bruno Lima", "Carla Mendes"};
        double[] tarifas = {1200.00, 150.00, 300.00};

        for (int i = 0; i < emissores.size(); i++) {
            emissores.get(i).emitir(passageiros[i], tarifas[i]);
        }
    }
}
