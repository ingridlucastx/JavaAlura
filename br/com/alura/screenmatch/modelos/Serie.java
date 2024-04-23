package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPoTemporada;
    private int minutosPorEp;

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodiosPoTemporada() {
        return episodiosPoTemporada;
    }

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodiosPoTemporada(int episodiosPoTemporada) {
        this.episodiosPoTemporada = episodiosPoTemporada;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPoTemporada * minutosPorEp;
    }
}
