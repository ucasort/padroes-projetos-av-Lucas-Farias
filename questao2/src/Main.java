import matricula.Matricula;
import matricula.brasil.FabricaArtefatosBrasil;
import matricula.chile.FabricaArtefatosChile;

public class Main {
    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new FabricaArtefatosBrasil());
        matriculaBrasil.confirmar("Joao Pereira", "123.456.789-00", "Java Avancado", 500.00);

        Matricula matriculaChile = new Matricula(new FabricaArtefatosChile());
        matriculaChile.confirmar("Camila Rojas", "12.345.678-5", "Java Avancado", 500.00);
    }
}
