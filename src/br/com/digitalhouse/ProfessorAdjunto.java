package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {

    private Integer quantidadeDeHorasDeMonitoria;

    public ProfessorAdjunto(Integer quantidadeDeHorasDeMonitoria) {
        this.quantidadeDeHorasDeMonitoria = quantidadeDeHorasDeMonitoria;
    }

    public Integer getQuantidadeDeHorasDeMonitoria() {
        return quantidadeDeHorasDeMonitoria;
    }

    public void setQuantidadeDeHorasDeMonitoria(Integer quantidadeDeHorasDeMonitoria) {
        this.quantidadeDeHorasDeMonitoria = quantidadeDeHorasDeMonitoria;
    }

}
