
import java.util.Scanner;



public class Calculadora{
    private static int totalVisualizacoes = 0;
    private static int totalCliques = 0;
    private static int totalCompartilhamentos = 0;
    private static int nivelCompartilhamento = 1;

    public static void novasVisualizacoes(int compartilhamentos) {
        int visualizacoes = 40 * compartilhamentos;
        totalVisualizacoes += visualizacoes;
        //remover
        System.out.println(visualizacoes + " visualiza��es no " + nivelCompartilhamento + "� n�vel");
        pessoasQueClicam(visualizacoes);
    }

    public static void pessoasQueCompartilham(int cliques) {
        nivelCompartilhamento++;
        int compartilhamentos = cliques * 3 / 20;
        totalCompartilhamentos += compartilhamentos;
        //remover
        System.out.println(compartilhamentos + " compartilhamentos no " + nivelCompartilhamento + "� n�vel");
        novasVisualizacoes(compartilhamentos);
    }

    public static void pessoasQueClicam(int visualizacoes) {
        int cliques = visualizacoes * 12 / 100;
        totalCliques += cliques;
        //remover
        System.out.println(cliques + " cliques no " + nivelCompartilhamento + "� n�vel");

        //Considerando que no 4� n�vel ainda seja considerados os cliques das visualiza��es geradas na ultima sequ�ncia
        if(nivelCompartilhamento < 4)
            pessoasQueCompartilham(cliques);
    }

    public static void primeirosVisualizadores(float valorInvestido) {
        int visualizacoes = (int) (valorInvestido * 30);
        totalVisualizacoes += visualizacoes;
        //remover
        System.out.println(visualizacoes + " visualizacoes no " + nivelCompartilhamento + "� n�vel");
        pessoasQueClicam(visualizacoes);
    }
    
    public static int total() {
    	return totalVisualizacoes ;
    }
}