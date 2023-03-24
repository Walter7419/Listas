import java.io.IOException;

public class Manager {
	Fibonacci fibo = new Fibonacci();
	Splitter split = new Splitter();
	Archivos file = new Archivos();

	public void ejecutar() {
		try {
    		file.write(fibo.listaFibonacci(), split.Par(fibo.listaFibonacci()), split.Impar(fibo.listaFibonacci()));

		}catch(IOException e){
            System.out.println("No se pudo escribir en el archivo.");
    	}
		
		}	
	}

