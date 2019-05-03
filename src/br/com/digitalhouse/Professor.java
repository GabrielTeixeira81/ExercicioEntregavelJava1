package br.com.digitalhouse;

public abstract class Professor {

    private String nome;
    private String sobreNome;
    private Integer tempo;
    private Integer tempoDeCasa;
    private Integer codigoDeProfessor;

    public Professor() {
    }

    public Professor(String nome, String sobreNome, Integer tempo, Integer tempoDeCasa, Integer codigoDeProfessor) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.tempo = tempo;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoDeProfessor = codigoDeProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoDeProfessor() {
        return codigoDeProfessor;
    }

    public void setCodigoDeProfessor(Integer codigoDeProfessor) {
        this.codigoDeProfessor = codigoDeProfessor;
    }

}
