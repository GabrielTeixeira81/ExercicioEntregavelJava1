package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();

    public DigitalHouseManager(List<Aluno> alunos, List<Professor> professores, List<Curso> cursos,
                               List<Matricula> matriculas) {
        this.alunos = alunos;
        this.professores = professores;
        this.cursos = cursos;
        this.matriculas = matriculas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }



    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){

    }

    public void excluirCurso(Integer codigoCurso) {
        List<Curso> removercursos = new ArrayList<>();
        for (Curso curso : cursos){
            if (curso.getCodigoCurso() != codigoCurso){
            curso.add(curso);
            }
        }
        cursos.remove(codigoCurso);
    }

    public void registrarProfessorAdjunto(String nome, String sobreNome, Integer codigoProfessor, Integer quantidadeDeHoras) {

    }

    public void registrarProfessorTitular(String nome, String sobreNome, Integer codigoProfessor, String especialidade){

    }

    public void excluirProfessor(Integer codigoProfessor){

    }

    public void  matricularAluno(String nome, String sobreNome, Integer codigoAluno) {

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }
}



