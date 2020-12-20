public class ProjetoFinal {

    public static void main(String[] args) {
	    Video v[] = new Video[3];
	    v[0] = new Video("Aula POO");
	    v[1] = new Video("Aula 3 de PHP");
	    v[2] = new Video("Aula 13 de Java");

	    v[0].setReproduzindo(true);
        //System.out.println(v[0].toString());


        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu",24,"M","jubs");

        Visualizacao vis = new Visualizacao(g[0],v[2]);
        System.out.println(vis.toString());


    }
}
