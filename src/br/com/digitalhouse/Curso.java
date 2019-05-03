package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codigoDeCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaDeAlunos;
    private List<Aluno> alunosMatriculados;



    public Curso(String nome, Integer codigoDeCurso, ProfessorTitular professorTitular,
                 ProfessorAdjunto professorAdjunto, Integer quantidadeMaximaDeAlunos, List<Aluno> alunosMatriculados) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
        this.alunosMatriculados = alunosMatriculados;
    }

    public Curso() {
    }


    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(Integer quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }


    public Boolean adicionarUmAluno (Aluno umAluno) {
        return this.alunosMatriculados.size() < quantidadeMaximaDeAlunos;
    }

   this.alunosMatriculados.add(umAluno);




    public void excluirAluno (Aluno umAluno){
        this.alunosMatriculados.remove(umAluno);
    }

}
