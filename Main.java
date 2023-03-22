import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Integer> listaFibonacci = new ArrayList<Integer>();
		
		listaFibonacci.add(1);
		listaFibonacci.add(1);
		for(int f=1; f<10000; f++) {
			if(listaFibonacci.get(f)>=1000000) {
				break;
			}
			listaFibonacci.add(listaFibonacci.get(f-1)+listaFibonacci.get(f));
			
		}
		System.out.println(listaFibonacci);

	
	}
}
