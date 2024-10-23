
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra;
		int deslocamento;

		System.out.print("Digite uma palavra: ");
		palavra = sc.next();
		System.out.print("Deslocamento: ");
		deslocamento = sc.nextInt();

		String textoRotacionado = rotacionar(palavra, deslocamento);

		System.out.print("Palavra criptografada: " + textoRotacionado);

		sc.close();
	}

	public static String rotacionar(String palavra, int deslocamento) {
				String resultado = "";
				char aux;
				
				for (int i = 0; i < palavra.length(); i++) {
					char cifra = palavra.charAt(i);
					
//					if (cifra >= 'A' && cifra <= 'Z') {
//						cifra = Character.toLowerCase(cifra);
//					} else {
//						cifra = Character.toUpperCase(cifra);
//					} (funciona também)
					
					if (Character.isLowerCase(cifra)) {
						aux = (char) ((cifra - 'a' + deslocamento)  % 26 + 'a');
						resultado += aux;
					} else if (Character.isUpperCase(cifra)){
						aux = (char) ((cifra - 'A' + deslocamento)  % 26 + 'A');
						resultado += aux;
					} else {
						resultado += cifra;
					}
				}
				
				return resultado;
			}

}
