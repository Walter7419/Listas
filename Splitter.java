import java.util.ArrayList;
import java.util.List;

public class Splitter {
	
	public List<Integer> Par(List<Integer> listaFibonacci){
		List<Integer> listaPares = new ArrayList<Integer>();
		for(int n=0; n<listaFibonacci.size(); n++) {
			if(listaFibonacci.get(n)%2==0) {
				listaPares.add(listaFibonacci.get(n));
			}
		}
		return listaPares;
	}
	public List<Integer> Impar(List<Integer> listaFibonacci){
		List<Integer> listaImpares = new ArrayList<Integer>();
		for(int n=0; n<listaFibonacci.size(); n++) {
			if(listaFibonacci.get(n)%2==1) {
				listaImpares.add(listaFibonacci.get(n));
			}
		}
		return listaImpares;
	}

}
