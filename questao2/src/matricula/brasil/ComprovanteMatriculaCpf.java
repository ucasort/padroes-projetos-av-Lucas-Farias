package matricula.brasil;

import matricula.ComprovanteMatricula;

class ComprovanteMatriculaCpf implements ComprovanteMatricula {
    private final String aluno;
    private final String cpf;
    private final String curso;

    ComprovanteMatriculaCpf(String aluno, String cpf, String curso) {
        this.aluno = aluno;
        this.cpf = cpf;
        this.curso = curso;
    }

    @Override
    public String descrever() {
        return "Comprovante de matricula - aluno " + aluno + ", CPF " + cpf + ", curso " + curso;
    }
}
