import java.util.List;
import java.util.ArrayList;

public class Fibonacci {	
	public List<Integer> listaFibonacci() {
		List<Integer> listaFibonacci = new ArrayList<Integer>();
		listaFibonacci.add(0);
		listaFibonacci.add(1);
		for(int f=1; f<10000; f++) {
			if(listaFibonacci.get(f)>=1000000) {
				break;
			}
			listaFibonacci.add(listaFibonacci.get(f-1)+listaFibonacci.get(f));	
		}
		return listaFibonacci;
	}
}
