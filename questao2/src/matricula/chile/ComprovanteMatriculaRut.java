package matricula.chile;

import matricula.ComprovanteMatricula;

class ComprovanteMatriculaRut implements ComprovanteMatricula {
    private final String aluno;
    private final String rut;
    private final String curso;

    ComprovanteMatriculaRut(String aluno, String rut, String curso) {
        this.aluno = aluno;
        this.rut = rut;
        this.curso = curso;
    }

    @Override
    public String descrever() {
        return "Comprovante de matricula - aluno " + aluno + ", RUT " + rut + ", curso " + curso;
    }
}
