public class Visualizacao {
    public Gafanhoto espectador;
    public Video filme;


    //CONSTRUTOR

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() +1);
        this.filme.setViews(this.filme.getViews() +1);
    }

    //GETTERS AND SETTERS

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //ToString

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porcentagem){
        int total = 0;
        if( porcentagem <= 20){
            total = 3;
        } else if ( porcentagem <= 50) {
            total = 5;
        } else if (porcentagem <= 90){
            total = 8;
        } else {
            total = 10;
        }

        this.filme.setAvaliacao(total);
    }
}



