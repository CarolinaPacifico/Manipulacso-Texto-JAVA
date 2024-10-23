import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	
	//variável global
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String [] lista = new String[5];
		String palavraEscolhida;
		
		
		//nome dos métodos
		lerPalavra(lista);
		palavraEscolhida = sortearPalavra(lista);
		jogar(palavraEscolhida);
		
		sc.close();
	}
	
	public static void jogar(String palavraEscolhida) {
		char[] letraDescoberta = new char [palavraEscolhida.length()];
		int erro = 0;
		char letra;
		boolean achei;
		
		//preencher o vetor com os traços
		for(int i = 0; i < letraDescoberta.length; i++) {
			letraDescoberta[i] = '_';
		}
		
		while(erro < 6 && !descobrirPalavra(letraDescoberta) ) {
			System.out.print("A palavra é: ");
			for(char ch : letraDescoberta) {
				System.out.print(ch + " ");
			}
			System.out.print("\nDigite uma letra: ");
			letra = sc.next().toUpperCase().charAt(0);
			
			//verificar se a letra 
			achei = false;
			for (int i = 0; i < palavraEscolhida.length(); i++) {
				if(palavraEscolhida.charAt(i) == letra) {
					letraDescoberta[i] = letra;
					achei = true;
				}
			}
			if(achei == false) {
				erro++;
				System.out.println("Você errou pela " + erro + "ª vez!");
			}
			System.out.println();
		}
		
		//verifica se o usuario foi enforcado ou acertou a palavra
		if(descobrirPalavra(letraDescoberta)) {
			System.out.print("PARABÉNS!! Você acertou a palavra secreta: ");
			System.out.print(palavraEscolhida);
		}
		else{
			System.out.println("VOCÊ FOI ENFORCADO");
		}
	}
	
	public static boolean descobrirPalavra(char[] letraDescoberta) {
		for (char ch: letraDescoberta) {
			if(ch == '_') {
				return false;
			}
		}
		return true;
	}
	
	public static void lerPalavra(String[] lista) {
		System.out.println("Digite as palavras: ");
		for (int i = 0; i < lista.length; i++) {
			lista[i] = sc.next().toUpperCase();
		}
	}
	
	public static String sortearPalavra(String[] lista) {
		Random rd = new Random();
		return lista[rd.nextInt(lista.length)];
	}

}
