
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Archivos {

		public static File file = new File("Fibonacci.txt");
	public void write(List<Integer> listaFibonacci, List<Integer> listaPar, List<Integer> listaImpar) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print("\nLista original: "+listaFibonacci);
		printWriter.print("\nLista con numeros Par: "+listaPar);
		printWriter.print("\nLista con numeros impar: "+listaImpar);
		System.out.println("Listo");

		printWriter.close();
		}
}