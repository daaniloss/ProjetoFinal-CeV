public class Gafanhoto extends Pessoa {
    private String login;
    private double totAssistido;


    //CONSTRUTOR
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }




    //GETTERS AND SETTERS


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(double totAssistido) {
        this.totAssistido = totAssistido;
    }

    //MÉTODOS
    public void viuMaisUm(){
        totAssistido ++;
        System.out.println("Assistiu mais um video, total: " + totAssistido);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "\nlogin=" + login +
                ", totAssistido=" + totAssistido +
                "} " + super.toString();
    }
}





