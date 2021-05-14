import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Date data = new Date();        	
		Cadastro cadastro = new Cadastro();
		Calculadora cal = new Calculadora();
		 System.out.print("Informe o valor investido: R$ ");
	        Scanner s = new Scanner(System.in);
	        float valorInvestido = s.nextFloat();

	        cal.primeirosVisualizadores(valorInvestido);
	       

	        
	        System.out.println();
	        System.out.println( "Nome do anuncio: " + cadastro.anuncio() + "\n" + "Nome do cliente: " + cadastro.cliente() );
	        System.out.println("Alcance total: " + cal.total() + " visualizações.");
	        System.out.println("Data de Inicio: "+data); 
	        System.out.println("Data de Termino: " + data.compareTo(data));
	}

	}


