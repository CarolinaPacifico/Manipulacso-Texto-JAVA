import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub

		FileReader arquivo;
		BufferedReader buffer;
		String linha;
		
		arquivo = new FileReader("c:\\sia\\aula\\exemplo.txt");
		buffer = new BufferedReader(arquivo);
		
		while((linha = buffer.readLine())!= null) {
			System.out.println(linha);
		}
	}

}
