import java.util.Scanner;

public class Cadastro {
	
	private static String anuncio;
	private static String cliente;
	
	static Scanner sc = new Scanner(System.in);
	
	public static String anuncio() {
		System.out.println("Digite o nome do anuncio: ");
		 anuncio = sc.nextLine();
		return anuncio ;
		
	}
	
	public static String cliente() {
		System.out.println("Digite o nome do Cliente: ");
		 cliente = sc.nextLine();
		return cliente ;
		
	}
}
