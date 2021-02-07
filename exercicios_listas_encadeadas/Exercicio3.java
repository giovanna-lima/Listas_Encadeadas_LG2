package exercicios_listas_encadeadas;

import java.util.LinkedList;

public class Exercicio3 {

	public static void main(String[] args) {
		Integer r =0;
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.addFirst(13);
		lista.add (14);
		lista.add (29);
		lista.add (17);
		lista.add (12);
		lista.add (50);
		lista.add (10);
		
		
		for(Integer i =0; i<lista.size(); i++) {
		Integer num = lista.get(i);
		r  = r + num;
			
			}
		System.out.println("O número da soma de todos elementos é: " + r);
	}

}
