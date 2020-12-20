public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private double views;
    private int curtidas;
    private boolean reproduzindo;

    //CONSTRUTOR

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }


    //GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public double getViews() {
        return views;
    }

    public void setViews(double views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }


    //MÉTODOS DE ACOESVIDEO
    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("Está reproduzindo");
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("Está pausado");
    }

    @Override
    public void like() {
        curtidas ++;
        System.out.println("Vídeo curtido, total: " + curtidas);
    }

    //TOsTRING

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
