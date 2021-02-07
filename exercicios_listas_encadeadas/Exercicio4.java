package exercicios_listas_encadeadas;

import java.util.LinkedList;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Integer m = 0;
	
		
LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.addFirst(13);
		lista.add (14);
		lista.add (29);
		lista.add (17);
		lista.add (102);
		lista.add (50);
		lista.add (10);
		
		for (Integer i = 0; i<lista.size(); i++) {
			Integer num = lista.get(i);
			
			if (num>m) {
				m=num;
			}
			else {
				m=m;
			}			
		}
		
		System.out.println("O maior número da lista é: " + m);
	}

}
