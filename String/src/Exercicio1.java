import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String[] lista = new String[5];
		String invertida;
		
		//entrada de dados
		System.out.println("digite as palavras: ");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(" ---> ");
			lista[i] = sc.next().toUpperCase();
		}
		
		//encontrar o(s) "par inverso"
		for(String palavra : lista) {
			invertida = "";
			
			//invertendo a palavra
			for (int i = palavra.length()-1; i >= 0;  i--) {
				invertida += palavra.charAt(i);
			}
			
			//busca pelos pares
			for(String word : lista) {
				if(invertida.equals(word)) {
					System.out.println("par --> " + palavra + ", " + word);
				}
			}
		}
	}

}
