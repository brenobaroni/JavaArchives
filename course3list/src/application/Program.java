package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Pedro");
		list.add("Gerivaldo");
		list.add("Trabsom");
		list.add("Nandinha");
		list.add(2, "Marcudo");
		
		list.remove("Pedro");
		list.removeIf(x -> x.charAt(0) == 'P');
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		System.out.println("Index of Trabsom :" + list.indexOf("Trabsom") );
		//quando nao encontra retorna -1
		
		System.out.println("-----------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for ( String x : result) {
			System.out.println(x);
		}
	}

}
